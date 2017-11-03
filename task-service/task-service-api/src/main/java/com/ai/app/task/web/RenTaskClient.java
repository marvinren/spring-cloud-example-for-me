package com.ai.app.task.web;

import com.ai.app.task.web.dto.RenTaskDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * RenTaskResources is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/3 0003
 * Time: 11:28
 * Description:
 */
@FeignClient("task-service")
public interface RenTaskClient {

    @GetMapping("/RenTask")
    List<RenTaskDto> getAll();
}