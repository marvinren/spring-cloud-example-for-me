package com.ai.app.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * TaskServiceApplication is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/3 0003
 * Time: 10:04
 * Description:
 */

@EnableEurekaClient
@SpringBootApplication
public class TaskServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskServiceApplication.class, args);
    }
}