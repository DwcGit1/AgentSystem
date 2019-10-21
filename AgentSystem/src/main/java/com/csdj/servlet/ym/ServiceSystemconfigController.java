package com.csdj.servlet.ym;

import com.csdj.entity.SystemConfig;
import com.csdj.service.ym.Serviceconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/serviceconfig")
public class ServiceSystemconfigController {
    @Autowired
    Serviceconfig serviceconfig;

    public void setServiceconfig(Serviceconfig serviceconfig) {
        this.serviceconfig = serviceconfig;
    }

    /*显示所有服务信息*/
    @RequestMapping(value = "showAllconfig")
    public String showAllconfig(HttpServletRequest request){
        List<SystemConfig> serviceSystemconfigs=serviceconfig.getAllconfigs();
        request.setAttribute("serviceSystemconfigs",serviceSystemconfigs);
        return "ym/ServiceSystemconfig";
    }
    /*删除服务信息*/
   @RequestMapping(value = "deleteconfig")
    public String deleteconfig(HttpServletRequest request,int id){
        int con=serviceconfig.deleteSystemConfigs(id);
        System.out.println("删除=========================>>>"+con);
        if(con>0){
            return "redirect:/serviceconfig/showAllconfig";
        }
        return "redirect:/serviceconfig/showAllconfig";
    }
  /*  修改服务信息*/
    @RequestMapping(value = "updateConfig")
    public String updateConfig(HttpServletRequest request,SystemConfig systemConfig){
        int con=serviceconfig.updateConfigs(systemConfig);
        System.out.println("修改=========================>>>"+con);
        if(con>0){
            return "redirect:/serviceconfig/showAllconfig";
        }
        return "redirect:/serviceconfig/showAllconfig";
    }
   /* 新增服务信息*/
   @RequestMapping(value = "addConfig")
   public String addConfig(HttpServletRequest request,SystemConfig systemConfig){
       int con=serviceconfig.addConfigs(systemConfig);
       System.out.println("新增=========================>>>"+con);
       if(con>0){
           return "redirect:/serviceconfig/showAllconfig";
       }
       return "redirect:/serviceconfig/showAllconfig";
   }
}
