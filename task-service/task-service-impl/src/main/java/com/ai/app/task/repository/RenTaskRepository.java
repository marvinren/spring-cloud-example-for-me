package com.ai.app.task.repository;

import com.ai.app.task.domain.RenTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface RenTaskRepository extends JpaRepository<RenTask, Long> {
}
