package com.ai.app.server.auth.repository;


import com.ai.app.server.auth.domain.SysUser;
import com.ai.app.server.auth.repository.support.JpaRangeRepository;

import java.util.Optional;

public interface SysUserRepository extends JpaRangeRepository<SysUser,Long> {
    Optional<SysUser> findOneWithRolesByUsername(String username);
}
