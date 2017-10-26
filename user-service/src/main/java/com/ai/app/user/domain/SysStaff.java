package com.ai.app.user.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class SysStaff implements Serializable {
    private Long STAFF_ID;

    private String CODE;

    private String EMPLOYEE_NAME;

    private static final long serialVersionUID = 1L;

    public Long getSTAFF_ID() {
        return STAFF_ID;
    }

    public void setSTAFF_ID(Long STAFF_ID) {
        this.STAFF_ID = STAFF_ID;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getEMPLOYEE_NAME() {
        return EMPLOYEE_NAME;
    }

    public void setEMPLOYEE_NAME(String EMPLOYEE_NAME) {
        this.EMPLOYEE_NAME = EMPLOYEE_NAME;
    }
}