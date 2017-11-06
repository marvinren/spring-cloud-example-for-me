package com.ai.app.task.configure;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * QuartzConfigure is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 20:56
 * Description:
 */
@Configuration
public class QuartzConfigure {

    @Bean
    Scheduler scheduler() throws SchedulerException {
        SchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        scheduler.start();

        return scheduler;

    }
}