package com.ai.app.task.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

/**
 * ScheduleJob is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 20:06
 * Description:
 */

@Entity
@Data
@ApiModel(value="可执行的任务",description="保存在数据库中的任务信息")
public class ScheduleJob {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable=false)
    @ApiModelProperty(value = "任务的名称", required = true, example = "测试任务1")
    String name;

    boolean isInstant = true;

    @Column(nullable=false)
    String type;

    String cron;

    String status;

    Instant lastExecuteTime;

    String createdBy;

    Instant createAt;

    String command;

    @Lob
    @Basic(fetch=FetchType.LAZY)
    String datas;


}