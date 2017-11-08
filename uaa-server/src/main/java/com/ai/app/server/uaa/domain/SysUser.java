package com.ai.app.server.uaa.domain;

import com.ai.app.server.uaa.configure.Constants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * SysUser is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/8 0008
 * Time: 15:41
 * Description:
 */

@Entity
@Data
@Table(name="uaa_sys_user")
public class SysUser extends AbstractAuditingEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Pattern(regexp = Constants.LOGIN_REGEX)
    @Size(min = 1, max = 50)
    @Column(length = 50, unique = true, nullable = false)
    private String login;

    @JsonIgnore
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "password_hash",length = 60)
    private String password;

    @Size(max = 50)
    private String name;

    @Size(max = 50)
    private String email;

    @Size(max = 256)
    @Column(length = 256)
    private String imageUrl;

    @NotNull
    @Column(nullable = false)
    private boolean activated = false;


    @Size(max = 20)
    @Column(length = 20)
    @JsonIgnore
    private String activationKey;

    @Size(max = 20)
    @Column(length = 20)
    @JsonIgnore
    private String resetKey;

    private Instant resetDate = null;


    @JsonIgnore
    @ManyToMany(targetEntity = SysRole.class,fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<SysRole> roles = new HashSet<>();

    @Transient
    private Set<GrantedAuthority> authorities = new HashSet<>();

    public Set<GrantedAuthority> getOriginalAuthorityes(){
        return this.authorities;
    }


    public Set<GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> userAuthotities = new HashSet<>();
        for(SysRole role : this.roles){
            for(SysAuthority authority : role.getAuthorities()){
                userAuthotities.add(new SimpleGrantedAuthority(authority.getName()));
            }
        }
        return userAuthotities;
    }
}