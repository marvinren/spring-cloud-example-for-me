package com.ai.app.server.auth.repository;


import com.ai.app.server.auth.domain.SysAuthority;
import com.ai.app.server.auth.repository.support.JpaRangeRepository;

public interface SysAuthotityRepository extends JpaRangeRepository<SysAuthority,Long> {
}
