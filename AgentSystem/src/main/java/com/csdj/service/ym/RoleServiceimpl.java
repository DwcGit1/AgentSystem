package com.csdj.service.ym;

import com.csdj.dao.ym.RoleMapper;
import com.csdj.entity.Role;
import com.csdj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("roleervice")
public class RoleServiceimpl implements RoleService{

    @Autowired
    public RoleMapper roleMapper;


    @Override
    public List<Role> getRoles() {
        return roleMapper.getRole();
    }

    @Override
    public int addRoles(Role role) {
        return roleMapper.addRole(role);
    }

    @Override
    public int deleteRoles(int id) {
        return roleMapper.deleteRole(id);
    }

    @Override
    public int updateRoles(Role role) {
        return roleMapper.updateRole(role);
    }
}
