package com.ai.app.server.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * UaaServerApplication is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/7 0007
 * Time: 17:10
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UaaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UaaServerApplication.class, args);
    }
}