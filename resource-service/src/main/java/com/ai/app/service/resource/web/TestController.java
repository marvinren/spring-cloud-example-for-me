package com.ai.app.service.resource.web;

import com.ai.app.service.resource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/10/20 0020
 * Time: 18:05
 * Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Boolean login(){
        return userService.login();
    }
}