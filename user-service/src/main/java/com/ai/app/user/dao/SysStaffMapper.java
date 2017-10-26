package com.ai.app.user.dao;

import com.ai.app.user.domain.SysStaff;
import com.ai.app.user.domain.SysStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStaffMapper {
    long countByExample(SysStaffExample example);

    int deleteByExample(SysStaffExample example);

    int deleteByPrimaryKey(Long STAFF_ID);

    int insert(SysStaff record);

    int insertSelective(SysStaff record);

    List<SysStaff> selectByExample(SysStaffExample example);

    SysStaff selectByPrimaryKey(Long STAFF_ID);

    int updateByExampleSelective(@Param("record") SysStaff record, @Param("example") SysStaffExample example);

    int updateByExample(@Param("record") SysStaff record, @Param("example") SysStaffExample example);

    int updateByPrimaryKeySelective(SysStaff record);

    int updateByPrimaryKey(SysStaff record);

    SysStaff selectEmployeeByStaffID(Long STAFF_ID);
}