package com.csdj.servlet.ym;

import com.csdj.entity.Function;
import com.csdj.entity.Role;
import com.csdj.service.ym.SystemRoleService;
import com.csdj.service.ym.SystemconfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/serviceRole")
public class SystemRoleController {
    @Autowired
    SystemRoleService systemRoleService;

    public void setSystemRoleService(SystemRoleService systemRoleService) {
        this.systemRoleService = systemRoleService;
    }

    /*显示所有角色信息*/
    @RequestMapping(value = "showRoleInfo")
    public String showRoleInfo(HttpServletRequest request){
        List<Role> roles=systemRoleService.getAllRoles();
        List<Function> functions=systemRoleService.getAllFunctions();
        request.setAttribute("function",functions);
        request.setAttribute("role",roles);
        return "ym/SystemRole";
    }
    /*显示所有功能信息*/
    @RequestMapping(value = "showAllFunction")
    public String showAllFunction(HttpServletRequest request){
        List<Function> functions=systemRoleService.getAllFunctions();
        request.setAttribute("function",functions);
        return "ym/SystemRole";
    }











}
