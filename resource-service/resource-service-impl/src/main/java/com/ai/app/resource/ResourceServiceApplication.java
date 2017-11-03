package com.ai.app.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * ResourceServiceApplication is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/3 0003
 * Time: 10:04
 * Description:
 */

@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ai.app"})
@SpringBootApplication
public class ResourceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServiceApplication.class, args);
    }
}