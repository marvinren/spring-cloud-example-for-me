package com.ai.app.task.datamapper;

import com.ai.app.task.domain.RenTask;
import com.ai.app.task.web.dto.RenTaskDto;
import org.mapstruct.Mapper;

/**
 * RenTaskMapper is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/3 0003
 * Time: 14:16
 * Description:
 */

@Mapper(componentModel = "spring", uses = {})
public interface RenTaskMapper extends EntityMapper <RenTaskDto, RenTask> {

}

