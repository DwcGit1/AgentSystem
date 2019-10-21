package com.csdj.dao.ym;

import com.csdj.entity.Role;
import com.csdj.entity.User;

import java.util.List;

public interface RoleMapper {
    /*显示所有角色信息*/
    List<Role> getRole();
    /*新增角色信息*/
    int addRole(Role role);
    /*删除角色信息*/
    int deleteRole(int id);
   /* 修改角色信息*/
    int updateRole(Role role);
}
