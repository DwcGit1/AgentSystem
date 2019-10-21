package com.csdj.servlet.ym;


import com.csdj.entity.Role;
import com.csdj.service.ym.RoleService;
import com.csdj.service.ym.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    /*显示所有角色信息*/
    @RequestMapping(value = "showRole")
    public String showRoles(HttpServletRequest request){
        List<Role> roleNice=roleService.getRoles();
        request.setAttribute("role",roleNice);
        return "ym/Role";
    }

    /*新增角色信息*/
    @RequestMapping(value = "addRoles")
    public String addRoles(HttpServletRequest request,Role role){
        int con=roleService.addRoles(role);
        System.out.println("新增===============================>>>"+con);
        if(con>0){
            return "redirect:/role/showRole";
        }
        return "redirect:/role/showRole";
    }
   /* 删除角色信息*/
    @RequestMapping(value = "deleteRoles")
    public String deleteRoles(HttpServletRequest request,int id){
        int con=roleService.deleteRoles(id);
        System.out.println("删除===============================>>>"+con);
            if(con>0){
            return "redirect:/role/showRole";
        }
        return "redirect:/role/showRole";
    }
    /*修改角色信息*/
    @RequestMapping(value = "updateRoles")
    public String updateRoles(HttpServletRequest request,Role role){
        int con=roleService.updateRoles(role);
        System.out.println("修改===============================>>>"+con);
        if(con>0){
            return "redirect:/role/showRole";
        }
        return "redirect:/role/showRole";
    }
















}
