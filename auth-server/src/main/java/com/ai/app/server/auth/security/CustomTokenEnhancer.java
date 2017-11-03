package com.ai.app.server.auth.security;

import com.ai.app.server.auth.domain.SysUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * CustomTokenEnhancer is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/1 0001
 * Time: 16:32
 * Description:
 */
@Component
public class CustomTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        CustomLoginedUser user = (CustomLoginedUser) authentication.getPrincipal();
        Map<String, Object> additional = new HashMap<>();
        additional.put("id", user.getSysUser().getId());
        additional.put("username", user.getSysUser().getUsername());
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additional);
        return accessToken;
    }
}