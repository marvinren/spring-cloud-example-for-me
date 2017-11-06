package com.ai.app.task.service;

import com.ai.app.task.domain.ScheduleJob;
import com.ai.app.task.service.dto.QuartzJobDto;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * ScheduleService is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 22:26
 * Description:
 */
@Service
public class QuartzScheduleService {

    @Autowired
    private Scheduler scheduler;


    public List<QuartzJobDto> getSchdulerTrigger() throws SchedulerException {
        GroupMatcher<JobKey> matcher = GroupMatcher.anyJobGroup();
        Set<JobKey> jobKeys = scheduler.getJobKeys(matcher);
        List<QuartzJobDto> jobList = new ArrayList<QuartzJobDto>();
        for (JobKey jobKey : jobKeys) {
            List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobKey);
            for (Trigger trigger : triggers) {
                QuartzJobDto job = new QuartzJobDto();
                job.setId(Long.parseLong(trigger.getKey().getName()));
                job.setQuartz_job_name(jobKey.getName());
                job.setQuartz_job_group(jobKey.getGroup());
                job.setQuartz_trigger_name(trigger.getKey().getName());
                job.setQuartz_trigger_group(trigger.getKey().getGroup());
                Trigger.TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());
                job.setQuartz_trigger_status(triggerState.name());
                if (trigger instanceof CronTrigger) {
                    CronTrigger cronTrigger = (CronTrigger) trigger;
                    String cronExpression = cronTrigger.getCronExpression();
                    job.setQuartz_triiger_cron(cronExpression);
                }
                jobList.add(job);
            }
        }

        return jobList;
    }
}