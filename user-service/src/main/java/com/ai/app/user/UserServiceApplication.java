package com.ai.app.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.swing.*;

/**
 * UserServiceApplication is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/10/20 0020
 * Time: 15:51
 * Description:
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.ai.app.user.dao")
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}