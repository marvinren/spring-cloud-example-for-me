package com.ai.app.task.service;

import com.ai.app.task.domain.ScheduleJob;
import com.ai.app.task.repository.ScheduleJobRepository;
import com.ai.app.task.task.ShellJob;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.quartz.CronScheduleBuilder.cronSchedule;

/**
 * ScheduleJobService is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 21:19
 * Description:
 */
@Transactional
@Service
public class ScheduleJobService {

    @Autowired
    private ScheduleJobRepository scheduleJobRepository;

    @Autowired
    private Scheduler scheduler;

    public ScheduleJob create(ScheduleJob sjob) throws SchedulerException {
        scheduleJobRepository.saveAndFlush(sjob);
        this.scheduleJob(sjob);
        return sjob;
    }

    public ScheduleJob update(ScheduleJob sjob) throws SchedulerException {
        scheduleJobRepository.saveAndFlush(sjob);
        this.scheduler.rescheduleJob(generateTriggerKey(sjob), this.generateTrigger(sjob));
        return sjob;
    }

    public void delete(Long id) throws SchedulerException {
        ScheduleJob sjob = this.scheduleJobRepository.getOne(id);
        this.scheduler.pauseTrigger(generateTriggerKey(sjob));
        this.scheduler.unscheduleJob(generateTriggerKey(sjob));
        this.scheduleJobRepository.delete(sjob);
    }

    @Transactional(readOnly = true)
    public List<ScheduleJob> all(){
        return scheduleJobRepository.findAll();
    }

    private void scheduleJob(ScheduleJob job) throws SchedulerException {
        this.scheduler.scheduleJob(this.generateJobDetail(job), this.generateTrigger(job));
    }

    private JobKey generateJobKey(ScheduleJob job){
        return new JobKey(String.valueOf(job.getId()), "schedule_job");
    }

    private TriggerKey generateTriggerKey(ScheduleJob job){
        return new TriggerKey(String.valueOf(job.getId()), "schedule_job_trigger");
    }

    private JobDetail generateJobDetail(ScheduleJob job){

        JobDetail jobDetail = JobBuilder.newJob(ShellJob.class)
                .withIdentity(this.generateJobKey(job))
                .build();

        return jobDetail;
    }

    private Trigger generateTrigger(ScheduleJob job){

        Trigger trigger;
        if (job.isInstant())
            trigger = TriggerBuilder.newTrigger()
                    .withIdentity(this.generateTriggerKey(job))
                    .startNow().build();
        else
            trigger = TriggerBuilder.newTrigger()
                    .withIdentity(this.generateTriggerKey(job))
                    .withSchedule(cronSchedule(job.getCron()))
                    .build();

        trigger.getJobDataMap().put("data", job.getDatas());
        trigger.getJobDataMap().put("command", job.getCommand());

        return trigger;

    }


}