package com.ai.app.service.resource.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UserService is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/10/20 0020
 * Time: 18:03
 * Description:
 */
@FeignClient("user-service")
public interface UserService {

    @RequestMapping("/user/login")
    Boolean login();

}