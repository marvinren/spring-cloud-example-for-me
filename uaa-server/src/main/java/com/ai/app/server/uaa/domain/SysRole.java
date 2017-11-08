package com.ai.app.server.uaa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * SysRole is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/8 0008
 * Time: 15:47
 * Description:
 */
@Entity
@Table(name="uaa_sys_role")
@Data
public class SysRole  extends AbstractAuditingEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String value;

    @JsonIgnore
    @ManyToMany(targetEntity = SysAuthority.class,fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<SysAuthority> authorities = new HashSet<>();
}