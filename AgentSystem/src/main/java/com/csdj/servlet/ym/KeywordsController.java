package com.csdj.servlet.ym;


import com.csdj.entity.Keywords;
import com.csdj.service.ym.KeywordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/keywords")
public class KeywordsController {

    @Autowired
    KeywordsService keywordsService;
    public void setKeywordsService(KeywordsService keywordsService) {
        this.keywordsService = keywordsService;
    }
    /*显示所有关键词审核信息*/
    @RequestMapping(value = "showKeywords")
    public String showkeywords(HttpServletRequest request){
        List<Keywords> keywordsNice=keywordsService.getKeywordsNice();
        request.setAttribute("keywords",keywordsNice);
        return "ym/Keywords";
    }
    /*按关键词查询审核信息*/
    @RequestMapping(value = "showLikekeywords")
    public String showLikekeywords(HttpServletRequest request,@RequestParam(required = false) String key){
        List<Keywords> keywordsNice=keywordsService.getlikeKeywordsNice(key);
        request.setAttribute("keywords",keywordsNice);
        request.setAttribute("key",key);
        System.out.println("关键词=============================================>>>"+key);
        return "ym/Keywords";
        /*return "redirect:/keywords/showKeywords";*/
    }
    /*修改客户使用状态*/
    @RequestMapping(value = "updatekeywords")
    public String updatekeywords(HttpServletRequest request,@RequestParam(required = false) int id){
        int con=keywordsService.updateKeys(id);
        System.out.println(con);
        if(con>0){
            return "redirect:/keywords/showKeywords";
        }
        return "redirect:/keywords/showKeywords";
    }
    /*修改客户不使用状态*/
    @RequestMapping(value = "updatenotkeywords")
    public String updatenotkeywords(HttpServletRequest request,@RequestParam(required = false) int id){
        int con=keywordsService.updatenotKeys(id);
        System.out.println(con);
        if(con>0){
            return "redirect:/keywords/showKeywords";
        }
        return "redirect:/keywords/showKeywords";
    }










}
