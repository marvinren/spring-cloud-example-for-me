package com.ai.app.task.web;

import com.ai.app.task.domain.RenTask;
import com.ai.app.task.service.RenTaskService;
import com.ai.app.task.web.dto.RenTaskDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RenTaskResources is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/3 0003
 * Time: 10:46
 * Description:
 */
@RestController
public class RenTaskResources implements RenTaskClient{

    @Autowired
    RenTaskService renTaskService;

    @Override
    public List<RenTaskDto> getAll() {
        return this.renTaskService.all();
    }

    @PostMapping("/RenTask")
    public RenTask create(@RequestBody RenTask renTask){
        return this.renTaskService.create(renTask);
    }

}