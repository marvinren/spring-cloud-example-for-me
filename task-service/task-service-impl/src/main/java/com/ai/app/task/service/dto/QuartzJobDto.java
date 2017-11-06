package com.ai.app.task.service.dto;

import lombok.Data;

import java.time.Instant;

/**
 * QuartzJobDto is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 22:33
 * Description:
 */
@Data
public class QuartzJobDto {

    Long id;

    String name;

    boolean instant;

    String type;

    String cron;

    String status;

    Instant lastExecuteTime;

    String createdBy;

    Instant createAt;

    String command;

    String quartz_job_name;

    String quartz_job_group;

    String quartz_trigger_name;

    String quartz_trigger_group;

    String quartz_trigger_status;

    String quartz_triiger_cron;
}