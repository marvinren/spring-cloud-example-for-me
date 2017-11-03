package com.ai.app.task.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * RenTask is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/3 0003
 * Time: 10:41
 * Description:
 */

@Entity
@Data
public class RenTask {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false)
    String taskName;

    boolean instant;

    String cron;

    String scheduleName;

}