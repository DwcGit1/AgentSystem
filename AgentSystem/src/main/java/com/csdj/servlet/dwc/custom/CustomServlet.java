package com.csdj.servlet.dwc.custom;

import com.csdj.entity.*;
import com.csdj.service.dwc.custom.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import sun.misc.Request;

@Controller
@RequestMapping("/sys")
public class CustomServlet {

    //private Logger logger=Logger.getLogger(CustomServlet.class);

    @Autowired
    private CustomService customService;

    @RequestMapping(value = "/showCustomlist.json",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
        public List<Custom> getCustomlist(){
            return customService.getCustom();
    }

    @RequestMapping(value = "/lookCustomlist.json",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<Custom> getCustomlistBy(@RequestParam("customName") String customName){
        return customService.getCustomByCustomName(customName);
    }

    @RequestMapping(value = "/get_contact.json",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<Contact> getContact(){
        return customService.getContact();
    }

    @RequestMapping(value = "/get_province.json" ,method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<Province> getProvince(){
        return customService.getProvince();
    }

    @RequestMapping(value = "/get_City.json",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<City> getCity(){
        return customService.getCity();
    }

    @RequestMapping(value = "/get_Area.json",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<Area> getArea(){
        return customService.getArea();
    }

    @RequestMapping(value = "/updCustom.html",method = {RequestMethod.GET,RequestMethod.POST})
    public String updCustom(Custom custom){
        int state=customService.updCustom(custom);
        if(state>0){
            return "redirect:/sys/showCustomlist.html";
        }else{
            return "UpdClientInfo";
        }
    }

    @RequestMapping(value = "/updCustomStatus.json/{item}",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Object updCustomStatus(@PathVariable int[] item){
        Custom custom=new Custom();
        custom.setId(item[0]);
        custom.setCustomStatus(item[1]);
        int state=customService.updCustomStatus(custom);
        int i=0;
        try {
            i=customService.updCustomStatus(custom);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;

    }

    @RequestMapping(value = "/addCustom.html",method = {RequestMethod.GET,RequestMethod.POST})
    public String addCustom(Custom custom, HttpServletRequest request){
        if(custom.getCustomType()==16){
            custom.setCustomTypeName("企业");
        }else if(custom.getCustomType()==17){
            custom.setCustomTypeName("个人");
        }else if(custom.getCustomType()==18){
            custom.setCustomTypeName("政府");
        }
        if(custom.getCardType()==19){
            custom.setCardTypeName("国内身份证");
        }else if(custom.getCardType()==20){
            custom.setCardTypeName("境内身份证");
        }else if(custom.getCardType()==21){
            custom.setCardTypeName("营业执照");
        }else if(custom.getCardType()==22){
            custom.setCardTypeName("其他类型");
        }
        HttpSession session =request.getSession();
        User user= (User) session.getAttribute("users");
        custom.setAgentId(user.getId());
        custom.setAgentCode(user.getUserCode());
        custom.setAgentName(user.getUserName());
        custom.setCountry("中国");

        int state=customService.addCustom(custom);

        if(state>0){
            return "redirect:/sys/showCustomlist.html";
        }else{
            return "AddAccountDetail";
        }
    }
}
