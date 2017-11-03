package com.ai.app.server.auth.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class SysAuthority extends AbstractAuditingEntity{
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @NotNull
    private String value;
}
