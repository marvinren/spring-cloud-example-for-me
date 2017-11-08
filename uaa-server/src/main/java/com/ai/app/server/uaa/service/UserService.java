package com.ai.app.server.uaa.service;

import com.ai.app.server.uaa.domain.SysRole;
import com.ai.app.server.uaa.domain.SysUser;
import com.ai.app.server.uaa.repository.SysUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * UserService is Created by Renzq
 * Email: renzq@asiainfo.com
 * Date: 2017/11/8 0008
 * Time: 16:08
 * Description:
 */
@Service
@Transactional
@Slf4j
public class UserService {

    @Autowired
    SysUserRepository sysUserRepository;

    @Autowired
    EntityManager em;



    @Transactional(readOnly = true)
    public Optional<SysUser> getUserWithAuthoritiesByLogin(String login) {
        return sysUserRepository.findOneWithRolesByLogin(login);
    }

    @Transactional(readOnly = true)
    public Optional<SysUser> getUserFromSecframe(String login) {

        Query userQuery = em.createNativeQuery("select s.staff_id, s.code, s.password, e.employee_name, e.email, e.ext1 from sys_staff s, sys_employee e where s.employee_id = e.employee_id and s.code = ?");
        userQuery.setParameter(1, login);
        Object[] singleResult = (Object[])userQuery.getSingleResult();
        if(singleResult == null)
            return Optional.empty();

        SysUser user = new SysUser();
        user.setId(((BigDecimal) singleResult[0]).longValue());
        user.setLogin((String)singleResult[1]);
        //这里暂时设置所有的密码为admin，在之后正式介入之后，可以修改使用下面的语句
        //user.setPassword((String)singleResult[2]);
        user.setPassword(new BCryptPasswordEncoder().encode("admin"));
        user.setName((String)singleResult[3]);
        user.setEmail((String)singleResult[4]);
        user.setImageUrl((String)singleResult[5]);
        user.setActivated(true);
        user.setActivationKey("");

        //select * from sys_role r, sys_staff f, sys_staff_role_author sr where sr.role_id = r.role_id and sr.staff_id = f.staff_id and f.code='ADMIN'
        Query roleQuery = em.createNativeQuery("select s.station_id, s.code, s.name from sys_author a, sys_station s, sys_staff st where a.station_id = s.station_id and a.staff_id = st.staff_id and st.staff_id = ?");
        roleQuery.setParameter(1, user.getId());
        List<Object[]> roleResultList = roleQuery.getResultList();
        roleResultList.stream().forEach((r)->{
            SysRole role = new SysRole();
            role.setName((String)r[2]);
            role.setValue((String)r[1]);
            user.getRoles().add(role);
        });

        Query authorityQuery = em.createNativeQuery("select f.func_code, f.name, f.viewname from sys_stationtype_func sf, sys_function f where sf.func_id = f.func_id and sf.station_type_id in(select distinct s.station_type_id from sys_author a, sys_station s, sys_staff st where a.station_id = s.station_id and a.staff_id = st.staff_id and st.staff_id = ?)");
        authorityQuery.setParameter(1, user.getId());
        List<Object[]> authorityResultList = authorityQuery.getResultList();
        authorityResultList.stream().forEach((a) ->{
            GrantedAuthority auth = new SimpleGrantedAuthority((String)a[0]);
            user.getOriginalAuthorityes().add(auth);
        });

        return Optional.of(user);

    }


    /*
select * from sys_station_type--岗位类型
select * from sys_station--岗位，和组织关联
select * from sys_author--授权，岗位和员工关联
select * from sys_function--菜单
select * from sys_stationtype_func--岗位和菜单关联
select * from sys_role--角色
select * from sys_staff_role_author--角色授权  角色和员工关联
select * from sys_staff--员工账号  包括密码账号
select * from sys_employee--员工信息
 */

}