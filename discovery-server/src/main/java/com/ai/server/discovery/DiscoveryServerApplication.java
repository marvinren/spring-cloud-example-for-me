package com.ai.server.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * DiscoveryServerApplication is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/10/30 0030
 * Time: 14:51
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
public class DiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}