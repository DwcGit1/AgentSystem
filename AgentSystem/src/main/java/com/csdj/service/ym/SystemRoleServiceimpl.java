package com.csdj.service.ym;

import com.csdj.dao.ym.SystemRoleMapper;
import com.csdj.entity.Function;
import com.csdj.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("systemroleservice")
public class SystemRoleServiceimpl implements SystemRoleService{
    @Autowired
    public SystemRoleMapper systemUserMapper;

    public void setSystemUserMapper(SystemRoleMapper systemUserMapper) {
        this.systemUserMapper = systemUserMapper;
    }

    @Override
    public List<Role> getAllRoles() {
        return systemUserMapper.getAllRole();
    }

    @Override
    public List<Function> getAllFunctions() {
        return systemUserMapper.getAllFunction();
    }
}
