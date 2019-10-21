package com.csdj.servlet.dwc.portalManagement;

import com.csdj.entity.Contact;
import com.csdj.entity.Custom;
import com.csdj.entity.Keywords;
import com.csdj.service.dwc.portalManagement.PortalManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.dc.pr.PRError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/sys")
@Controller
public class PortalManagementServlet {

    @Autowired
    private PortalManagementService portalManagementService;

    @RequestMapping(value = "/getList.json")
    @ResponseBody
    public Map<String,Object> getList(Integer page, Integer limit){
        page= (page - 1) *limit ;
        System.out.println(limit);
        System.out.println(page);
        List<Keywords> keywordsList = portalManagementService.getAllKeywordsList(page, limit);
        Map<String,Object> map = new HashMap<>();
        map.put("code" , 0);
        map.put("mas" ,"");
        map.put("count",portalManagementService.show_keywords_Count());
        map.put("data",keywordsList);
        return map;
    }

    @RequestMapping(value = "/getListByName.json")
    @ResponseBody
    public Map<String,Object> getListByName(@RequestParam("page") Integer page, @RequestParam("limit")Integer limit, @RequestParam(value = "keywords",required = false)String keywords, @RequestParam(value = "customName",required = false)String customName){
        page= (page - 1) *limit ;
        System.out.println(limit);
        System.out.println(page);
        List<Keywords> keywordsList = portalManagementService.getListByName(page,limit,keywords,customName);
        Map<String,Object> map = new HashMap<>();
        map.put("code" , 0);
        map.put("mas" ,"");
        map.put("count",portalManagementService.show_keywords_Count());
        map.put("data",keywordsList);
        System.out.println("asdasdasfasfasdasd"+keywordsList);
        return map;
    }

    @RequestMapping(value = "/checkInfoById.html/{id}")
    public ModelAndView getkeywordInfo(@PathVariable("id") Integer id, ModelAndView mv){
        Keywords keywords = portalManagementService.getKeywordInfoById(id);
        Custom custom =portalManagementService.getCustom(id);
        if (custom != null) {
            List<Contact>  contactList=portalManagementService.getContactes(custom.getId());
            String province =portalManagementService.getProvinces(custom.getProvince());
            String area =portalManagementService.getAreas(custom.getArea());
            String city=portalManagementService.getCities(custom.getCity());
            mv.addObject("contactList",contactList);
            mv.addObject("area",area);
            mv.addObject("city",city);
            mv.addObject("province",province);
        }
        mv.addObject("custom",custom);
        mv.addObject("keywords",keywords);
        mv.setViewName("PMCheckInfo");
        return mv;
    }

    @RequestMapping(value = "/upInfoById.html/{id}")
    public ModelAndView upInfoById(@PathVariable("id")Integer id,ModelAndView mv){
        Keywords keywords = portalManagementService.getKeywordInfoById(id);
        Custom custom =portalManagementService.getCustom(id);
        if (custom != null) {
            List<Contact>  contactList=portalManagementService.getContactes(custom.getId());
            String province =portalManagementService.getProvinces(custom.getProvince());
            String area =portalManagementService.getAreas(custom.getArea());
            String city=portalManagementService.getCities(custom.getCity());
            mv.addObject("contactList",contactList);
            mv.addObject("area",area);
            mv.addObject("city",city);
            mv.addObject("province",province);
        }
        mv.addObject("custom",custom);
        mv.addObject("keywords",keywords);
        mv.setViewName("PMUpdInfo");
        return mv;
    }

    @RequestMapping(value = "/upKeywordsInfoById.html")
    public String upKeywordsInfoById(Keywords keywords){
        System.out.println(keywords.getAppUserName()+"asfasfasf");
        boolean flag = portalManagementService.updKeywordsInfo(keywords);
        if(flag){
            return "PMCheckInfo";
        }else{
            return "redirect:/keyword/upInfoById.html/" + keywords.getId();
        }
    }
}
