package com.csdj.service.ym;

import com.csdj.entity.Function;
import com.csdj.entity.Role;

import java.util.List;

public interface SystemRoleService {
    List<Role> getAllRoles();
    List<Function> getAllFunctions();
}
