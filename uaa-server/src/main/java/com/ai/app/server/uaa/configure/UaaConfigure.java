package com.ai.app.server.uaa.configure;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.*;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.security.KeyPair;

/**
 * UaaConfigure is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/8 0008
 * Time: 11:12
 * Description:
 *  token目前只保存在内存中，最佳方案保存在redis里
 *  client的配置应该放入配置文件里
 */
@Configuration
@EnableAuthorizationServer
public class UaaConfigure extends AuthorizationServerConfigurerAdapter {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UaaProperties uaaProperties;


    @EnableResourceServer
    public static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

        @Autowired
        CorsFilter corsFilter;

        @Autowired
        TokenStore tokenStore;


        @Override
        public void configure(HttpSecurity http) throws Exception {
            http
                    .exceptionHandling()
                    .authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
                    .and()
                        .csrf()
                            .disable()
                        .addFilterBefore(corsFilter, UsernamePasswordAuthenticationFilter.class)
                        .headers()
                            .frameOptions()
                            .disable()
                    .and()
                        .sessionManagement()
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                        .authorizeRequests()
                        .antMatchers("/api/register").permitAll()
                        .antMatchers("/api/activate").permitAll()
                        .antMatchers("/api/authenticate").permitAll()
                        .antMatchers("/api/account/reset_password/init").permitAll()
                        .antMatchers("/api/account/reset_password/finish").permitAll()
                        .antMatchers("/api/profile-info").permitAll()
                        .antMatchers("/api/**").authenticated()
                        .antMatchers("/management/health").permitAll()
                        .antMatchers("/management/**").permitAll()
                        .antMatchers("/v2/api-docs/**").permitAll()
                        .antMatchers("/swagger-resources/configuration/ui").permitAll()
                        .antMatchers("/swagger-ui/index.html").permitAll();
            }

        @Override
        public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
            resources.resourceId("ai-uaa-resource").tokenStore(tokenStore);
        }
    }


    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        /*
        For a better client design, this should be done by a ClientDetailsService (similar to UserDetailsService).
         */
        clients.inMemory()
                .withClient(uaaProperties.getSecurity().getClientAuthorization().getWebappClientId())
                .scopes("web-app")
                .secret(uaaProperties.getSecurity().getClientAuthorization().getWebappClientSecret())
                //.autoApprove(true)
                .authorizedGrantTypes("implicit","refresh_token", "password", "authorization_code")
                .and()
                .withClient(uaaProperties.getSecurity().getClientAuthorization().getClientId())
                .secret(uaaProperties.getSecurity().getClientAuthorization().getClientSecret())
                .scopes("web-app")
                .autoApprove(true)
                .authorizedGrantTypes("client_credentials");
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        oauthServer.tokenKeyAccess("permitAll()").checkTokenAccess(
                "isAuthenticated()");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager).accessTokenConverter(
                jwtAccessTokenConverter());
    }

    /**
     * Apply the JWT token converter (and enhander) for token store.
     */
    @Bean
    public JwtTokenStore tokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    /**
     * This bean generates an token enhancer, which manages the exchange between JWT acces tokens and Authentication
     * in both directions.
     *
     * @return an access token converter configured with the authorization server's public/private keys
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        KeyPair keyPair = new KeyStoreKeyFactory(
                new ClassPathResource("keystore.jks"), "password".toCharArray())
                .getKeyPair("selfsigned");
        converter.setKeyPair(keyPair);
        return converter;
    }
}