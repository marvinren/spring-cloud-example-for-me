package com.ai.app.user.web;

import com.ai.app.user.dao.SysStaffMapper;
import com.ai.app.user.domain.SysStaff;
import com.ai.app.user.domain.SysStaffExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserLoginController is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/10/20 0020
 * Time: 17:46
 * Description:
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserLoginController {

    @Autowired
    private SysStaffMapper sysStaffMapper;

    @RequestMapping("login")
    public Boolean login(){
        SysStaffExample sysstaffExample = new SysStaffExample();
        sysstaffExample.createCriteria().andSTAFF_IDIsNotNull();
        SysStaff staff = sysStaffMapper.selectEmployeeByStaffID((long) 1);
        log.info(staff.getEMPLOYEE_NAME());
        return true;
    }
}