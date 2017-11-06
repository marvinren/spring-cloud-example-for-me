package com.ai.app.task.repository;

import com.ai.app.task.domain.ScheduleJob;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ScheduleJobRepository is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/5 0005
 * Time: 21:18
 * Description:
 */
public interface ScheduleJobRepository extends JpaRepository<ScheduleJob, Long> {
}