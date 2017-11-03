package com.ai.app.service.system.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserLoginController is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/10/28 0028
 * Time: 12:21
 * Description:
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping("/dologin")
    public boolean dologin(@RequestParam("username") String username, @RequestParam("password") String password){
        return true;
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}