package com.csdj.servlet.ym;

import com.csdj.entity.SystemConfig;
import com.csdj.service.ym.AppurlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("appurlConfig")
public class AppurlController {
    @Autowired
    AppurlService appurlService;

    public void setService(AppurlService appurlService) {
        this.appurlService = appurlService;
    }
    /*显示App地址信息*/
    @RequestMapping(value = "showAppurl")
    public String showYear(HttpServletRequest request){
        List<SystemConfig> appConfigs=appurlService.getAppConfigs();
        request.setAttribute("appConfig",appConfigs);
        return "ym/Appurl";
    }
    /*修改App地址信息*/
    @RequestMapping(value = "updateConfig")
    public String updateConfig(HttpServletRequest request,SystemConfig systemConfig){
        int con=appurlService.updateAppConfigs(systemConfig);
        System.out.println("修改=====================>"+con);
        if(con>0){
            return "redirect:/appurlConfig/showAppurl";
        }
        return "redirect:/appurlConfig/showAppurl";
    }


}
