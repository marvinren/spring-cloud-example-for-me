package com.ai.app.task.task;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ShellJob is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 21:00
 * Description:
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
@Slf4j
public class ShellJob implements Job,InterruptableJob {

    boolean _interupt = false;
    Process process;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        log.info("=============Start Run A Job ==============");
        String command = context.getTrigger().getJobDataMap().getString("command");
        if(!_interupt) {
            if (!StringUtils.isEmpty(command)) {
                try {

                    this.process = Runtime.getRuntime().exec(command);
                    BufferedReader bufferedReader =
                            new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        log.info(line);
                    }
                    process.waitFor();

                } catch (Exception e) {
                    log.error(e.getMessage());
                    throw new JobExecutionException(e);
                }
            } else {
                log.warn("Can't find [command] param in jobDataMap.");
            }
        }


    }

    @Override
    public void interrupt() throws UnableToInterruptJobException {
        log.info("this job is interupted.");
        this._interupt = true;
        if(this.process != null){
            this.process.destroy();
        }
    }
}