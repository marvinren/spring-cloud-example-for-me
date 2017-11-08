package com.ai.app.server.uaa.security;

import com.ai.app.server.uaa.domain.SysUser;
import com.ai.app.server.uaa.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CustomUserDetailsService implements UserDetailsService {


    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
         log.debug("Authenticating {}", login);
        String upperLogin = login.toUpperCase();
        String lowerLogin = login.toLowerCase();
        Optional<SysUser> userFromDatabase = userService.getUserFromSecframe(upperLogin);

        return userFromDatabase.map(user -> {

            if (!user.isActivated()) {
                throw new UserNotActivatedException("User " + lowerLogin + " was not activated");
            }
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>(user.getOriginalAuthorityes());
            return new org.springframework.security.core.userdetails.User(lowerLogin,
                    user.getPassword(),
                    grantedAuthorities);
        }).orElseThrow(() -> new UsernameNotFoundException("User " + lowerLogin + " was not found in the " +
                "database"));
    }

}
