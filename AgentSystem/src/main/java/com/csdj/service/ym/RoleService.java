package com.csdj.service.ym;

import com.csdj.entity.Role;
import com.csdj.entity.User;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();
    int addRoles(Role role);
    int deleteRoles(int id);
    int updateRoles(Role role);
}
