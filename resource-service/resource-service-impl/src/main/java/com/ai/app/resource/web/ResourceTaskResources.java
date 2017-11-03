package com.ai.app.resource.web;

import com.ai.app.task.web.RenTaskClient;
import com.ai.app.task.web.dto.RenTaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ResourceTaskResources is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/3 0003
 * Time: 14:45
 * Description:
 */
@RestController
@RequestMapping("/task")
public class ResourceTaskResources {

    @Autowired
    private RenTaskClient renTaskClient;

    @RequestMapping("/all")
    public List<RenTaskDto> getTask(){
        return this.renTaskClient.getAll();

    }
}