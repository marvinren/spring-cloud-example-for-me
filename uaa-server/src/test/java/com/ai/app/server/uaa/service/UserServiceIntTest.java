package com.ai.app.server.uaa.service;

import com.ai.app.server.uaa.UaaServerApplication;
import com.ai.app.server.uaa.domain.SysUser;
import com.ai.app.server.uaa.repository.SysUserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * UserServiceIntTest is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/8 0008
 * Time: 16:42
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UaaServerApplication.class)
@Transactional
public class UserServiceIntTest {

    @Autowired
    UserService userService;

    @Autowired
    SysUserRepository sysUserRepository;



    @Test
    public void assertGetUserWithAuthoritiesByLogin() {
        Optional<SysUser> admin = userService.getUserWithAuthoritiesByLogin("admin");
        assertThat(admin.isPresent()).isTrue();
    }

    @Test
    public void assertfindFromSecframeByLogin(){
        Optional<SysUser> user = userService.getUserFromSecframe("ALM_ADMIN");
        System.out.println(user.get().getRoles().size());
        assertThat(user.isPresent()).isTrue();
        assertThat(user.get().getRoles().size()).isGreaterThan(0);
        assertThat(user.get().getOriginalAuthorityes().size()).isGreaterThan(0);
    }
}