package com.csdj.servlet.ym;


import com.csdj.entity.SystemConfig;
import com.csdj.service.ym.SystemconfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/systemconfig")
public class SystemconfigController {
    @Autowired
    SystemconfigService systemconfigService;
    public void setSystemconfigService(SystemconfigService systemconfigService) {
        this.systemconfigService = systemconfigService;
    }

    /*显示所有财务信息*/
    @RequestMapping(value = "showsystemconfig")
    public String showsystemconfig(HttpServletRequest request){
        List<SystemConfig> systemConfigs=systemconfigService.getsystemconfigs();
        request.setAttribute("systemConfigs",systemConfigs);
        return "ym/Systemconfig";
    }
    /*删除财务信息*/
    @RequestMapping(value = "deleteconfigs")
    public String deleteconfig(HttpServletRequest request,int id){
        int con=systemconfigService.deleteconfigs(id);
        System.out.println("删除============================>>>"+con);
        if(con>0){
            return "redirect:/systemconfig/showsystemconfig";
        }
        return "redirect:/systemconfig/showsystemconfig";
    }

   /* 新增财务信息*/
    @RequestMapping(value = "addconfig")
    public String addconfig(HttpServletRequest request,SystemConfig systemConfig){
        int con=systemconfigService.addsystemconfigs(systemConfig);
        System.out.println("新增============================>>>"+con);
        if(con>0){
            return "redirect:/systemconfig/showsystemconfig";
        }
        return "redirect:/systemconfig/showsystemconfig";
    }
   /* 修改财务信息*/
    @RequestMapping(value = "updateconfig")
    public String updateconfig(HttpServletRequest request,SystemConfig systemConfig){
        int con=systemconfigService.updateconfigs(systemConfig);
        System.out.println("修改============================>>>"+con);
        if(con>0){
            return "redirect:/systemconfig/showsystemconfig";
        }
        return "redirect:/systemconfig/showsystemconfig";
    }
















}
