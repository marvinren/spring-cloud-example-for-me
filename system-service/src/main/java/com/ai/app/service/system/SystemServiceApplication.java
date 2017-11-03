package com.ai.app.service.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * SystemServiceApplication is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/10/28 0028
 * Time: 12:18
 * Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class SystemServiceApplication {



    public static void main(String[] args) {
        SpringApplication.run(SystemServiceApplication.class, args);
    }
}