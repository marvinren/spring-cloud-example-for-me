


# 把服务加入到oauth认证中去

## 作为ResourceServer

* 首先增加依赖spring-security-oauth2
* @EnableResourceServer注解
* 必备配置信息`security.oauth2.resource.userInfoUri: http://localhost:9999/uaa/user`
```
@Configuration
@EnableResourceServer
public class SecurityConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.exceptionHandling()
                .and().csrf().disable().headers().frameOptions().disable()
                .and()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/uaa/**").permitAll()
                .antMatchers("/**").authenticated()
                .anyRequest().authenticated();
    }
}
```

```$xslt
security:
  ignored: /favicon.ico, /uaa/**, /
  basic:
    enabled: false
  user:
    password: none
  oauth2:
    client:
      clientId: portal
      clientSecret: marvinren
      accessTokenUri: ${ssoServiceUrl}/oauth/token
      userAuthorizationUri: ${ssoServiceUrl}/oauth/authorize
    resource:
      userInfoUri: ${ssoServiceUrl}/user
```
https://www.oschina.net/translate/spring-security-and-angular-js?lang=chs&page=6