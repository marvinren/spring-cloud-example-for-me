package com.ai.app.server.uaa.configure;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * UaaProperties is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/8 0008
 * Time: 15:09
 * Description:
 */
@Component
@ConfigurationProperties(prefix = "aiuaa")
public class UaaProperties {

    @Getter @Setter
    Security security;

    public static class Security {

        @Getter @Setter
        ClientAuthorization clientAuthorization;

        public static class ClientAuthorization {

            @Getter @Setter
            private String clientId;
            @Getter @Setter
            private String clientSecret;
            @Getter @Setter
            private String webappClientId;
            @Getter @Setter
            private String webappClientSecret;

        }
    }
}