package com.ai.app.service.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * ResourceServerApplication is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/10/20 0020
 * Time: 18:00
 * Description:
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class ResourceServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServerApplication.class, args);
    }
}