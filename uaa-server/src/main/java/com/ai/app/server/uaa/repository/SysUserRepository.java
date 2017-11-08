package com.ai.app.server.uaa.repository;


import com.ai.app.server.uaa.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SysUserRepository extends JpaRepository<SysUser,Long> {
    Optional<SysUser> findOneWithRolesByLogin(String login);

//    @Query(value = "SELECT s.staff_id as id, s.code as login, s.password as password FROM sys_staff s where s.code=?1",nativeQuery=true)
//    Optional<SysUser> findFromSecframeByLogin(String login);
}
