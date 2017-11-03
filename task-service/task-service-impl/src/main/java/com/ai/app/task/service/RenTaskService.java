package com.ai.app.task.service;

import com.ai.app.task.datamapper.RenTaskMapper;
import com.ai.app.task.domain.RenTask;
import com.ai.app.task.repository.RenTaskRepository;
import com.ai.app.task.web.dto.RenTaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * RenTaskService is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/3 0003
 * Time: 14:37
 * Description:
 */

@Transactional
@Service
public class RenTaskService {

    @Autowired
    private RenTaskRepository renTaskRepository;

    @Autowired
    private RenTaskMapper renTaskMapper;

    @Transactional(readOnly = true)
    public List<RenTaskDto> all() {
        return this.renTaskMapper.toDto(this.renTaskRepository.findAll());
    }

    public RenTask create(RenTask renTask){
        return this.renTaskRepository.save(renTask);
    }
}