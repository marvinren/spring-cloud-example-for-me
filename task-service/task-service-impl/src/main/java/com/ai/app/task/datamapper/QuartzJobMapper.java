package com.ai.app.task.datamapper;

import com.ai.app.task.domain.ScheduleJob;
import com.ai.app.task.service.dto.QuartzJobDto;
import org.mapstruct.Mapper;

/**
 * QuartzJobMapper is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 23:14
 * Description:
 */
@Mapper(componentModel = "spring", uses = {})
public interface QuartzJobMapper extends EntityMapper<QuartzJobDto, ScheduleJob> {
}