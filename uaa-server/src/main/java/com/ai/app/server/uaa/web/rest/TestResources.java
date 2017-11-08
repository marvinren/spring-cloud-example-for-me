package com.ai.app.server.uaa.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestResources is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/8 0008
 * Time: 11:08
 * Description:
 */
@RestController
@RequestMapping("/api")
public class TestResources {

    @RequestMapping("/echo")
    public String echo(){
        return "echo.....";
    }
}