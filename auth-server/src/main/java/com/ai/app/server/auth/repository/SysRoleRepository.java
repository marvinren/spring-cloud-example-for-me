package com.ai.app.server.auth.repository;


import com.ai.app.server.auth.domain.SysRole;
import com.ai.app.server.auth.repository.support.JpaRangeRepository;

public interface SysRoleRepository extends JpaRangeRepository<SysRole,Long> {
}
