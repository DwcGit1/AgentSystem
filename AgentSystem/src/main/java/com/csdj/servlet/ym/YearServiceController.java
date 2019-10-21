package com.csdj.servlet.ym;

import com.csdj.dao.ym.YearServiceMapper;
import com.csdj.entity.SystemConfig;
import com.csdj.service.ym.YaerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("yearservice")
public class YearServiceController {
    @Autowired
    YaerService yaerService;

    public void setYaerService(YaerService yaerService) {
        this.yaerService = yaerService;
    }

    /*显示服务年限信息*/
    @RequestMapping(value = "showYear")
    public String showYear(HttpServletRequest request){
        List<SystemConfig> yearConfigs=yaerService.getYearConfigs();
        System.out.println(yearConfigs.get(0).getConfigTypeName());
        request.setAttribute("yearConfig",yearConfigs);
        return "ym/YearService";
    }
    /*修改服务年限信息*/
    @RequestMapping(value = "updateYear")
    public String updateYear(HttpServletRequest request,SystemConfig systemConfig){
        int con=yaerService.updateYears(systemConfig);
        System.out.println("修改=====================>"+con);
        if(con>0){
            return "redirect:/yearservice/showYear";
        }
        return "redirect:/yearservice/showYear";
    }







}
