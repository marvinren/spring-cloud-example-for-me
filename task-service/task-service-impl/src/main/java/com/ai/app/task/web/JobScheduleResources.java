package com.ai.app.task.web;

import com.ai.app.task.datamapper.QuartzJobMapper;
import com.ai.app.task.domain.ScheduleJob;
import com.ai.app.task.service.QuartzScheduleService;
import com.ai.app.task.service.ScheduleJobService;
import com.ai.app.task.service.dto.QuartzJobDto;
import com.ai.app.task.task.ShellJob;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * JobScheduleResources is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 21:06
 * Description:
 */
@RestController
@RequestMapping("/job")
@Slf4j
@Api(value="任务接口")
public class JobScheduleResources {

    @Autowired
    private Scheduler scheduler;

    @Autowired
    private ScheduleJobService scheduleJobService;

    @Autowired
    private QuartzScheduleService quartzScheduleService;

    @Autowired
    private QuartzJobMapper quartzJobMapper;

    @GetMapping("/run")
    public void runAJob() throws SchedulerException {

        JobDetail job = JobBuilder.newJob(ShellJob.class).withIdentity("shellJob", "shell").build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("shellJob1", "shell").startNow().build();
        this.scheduler.scheduleJob(job, trigger);
    }

    @PostMapping("/")
    @ApiOperation("新增一个任务")
    public ScheduleJob create(@RequestBody @ApiParam ScheduleJob job) throws SchedulerException {
        return scheduleJobService.create(job);
    }

    @PutMapping("/")
    @ApiOperation("更新一个任务")
    public ScheduleJob update(@RequestBody @ApiParam ScheduleJob job) throws SchedulerException {
        return scheduleJobService.update(job);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除一个任务")
    public void delete(@PathVariable Long id) throws SchedulerException {
        scheduleJobService.delete(id);
    }

    @GetMapping("/")
    @ApiOperation("获取所有任务")
    public List<ScheduleJob> getAll(){
        List<ScheduleJob> jobs = scheduleJobService.all();
        return jobs;
    }


    @GetMapping("/all")
    @ApiOperation("获取所有quartz里的任务")
    public List<QuartzJobDto> all() throws SchedulerException {
        List<ScheduleJob> jobs = scheduleJobService.all();
        List<QuartzJobDto> quartzJobs = quartzScheduleService.getSchdulerTrigger();
        quartzJobs.stream().forEach((QuartzJobDto j) ->{
            ScheduleJob first = jobs.stream().filter((sj)-> sj.getId() == j.getId()).findFirst().get();
            j.setName(first.getName());
            j.setType(first.getType());
            j.setCommand(first.getCommand());
            j.setInstant(first.isInstant());
            j.setCron(first.getCron());
            j.setCreateAt(first.getCreateAt());
            j.setCreatedBy(first.getCreatedBy());
            j.setLastExecuteTime(first.getLastExecuteTime());
        });

        return quartzJobs;
    }
}