package com.csdj.dao.ym;

import com.csdj.entity.Function;
import com.csdj.entity.Role;

import java.util.List;

public interface SystemRoleMapper {
    /*显示所有角色信息*/
    List<Role> getAllRole();
    /* 显示所有功能信息*/
    List<Function> getAllFunction();
}
