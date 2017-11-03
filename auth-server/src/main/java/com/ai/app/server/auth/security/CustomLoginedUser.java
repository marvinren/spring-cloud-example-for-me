package com.ai.app.server.auth.security;

import com.ai.app.server.auth.domain.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * CustomLoginedUser is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/1 0001
 * Time: 16:49
 * Description:
 */
public class CustomLoginedUser extends User {

    SysUser sysUser;

    public CustomLoginedUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public CustomLoginedUser(SysUser user){
        this(user.getUsername(), user.getPassword(), user.getAuthorities());
        this.sysUser = user;
    }

    public SysUser getSysUser(){
        return this.sysUser;
    }
}