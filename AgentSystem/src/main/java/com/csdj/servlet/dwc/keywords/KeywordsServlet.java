package com.csdj.servlet.dwc.keywords;

import com.csdj.entity.Keywords;
import com.csdj.service.dwc.keywords.KeywordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/sys")
public class KeywordsServlet {

    @Autowired
    private KeywordsService keywordsService;

    @RequestMapping(value = "/getcustomername.json",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<String> getcustomername(){
        System.out.println("方法进入");
        List<String> list=keywordsService.getcustomername();
        return list;
    }

    @RequestMapping(value = "/addkeywords.html",method = {RequestMethod.GET,RequestMethod.POST})
    public String addkeywords(Keywords keywords) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        Date date1=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, +keywords.getServiceYears());
        date = calendar.getTime();
        calendar.add(Calendar.DATE, -7);
        date1=calendar.getTime();
        System.out.println(sdf.format(date1));
        keywords.setCustomId(2);
        keywords.setOpenApp(0);
        keywords.setAppUserName("admin");
        keywords.setAppPassword("123456");
        keywords.setPreRegDatetime(new Date());
        keywords.setRegPassDatetime(date1);
        keywords.setRegDatetime(new Date());
        keywords.setRegPassDatetime(date);
        keywords.setIsUse(1);
        keywords.setIsPass(2);
        keywords.setPreRegFrozenMoney(new BigDecimal(50000));
        keywords.setAgentId(2);
        keywords.setCheckStatus(0);
        keywords.setAgentName("admin");
        keywordsService.addKeywords(keywords);
        return "AgentClientManager";
    }

    @RequestMapping(value = "/solekeywords.json",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public int solekeywords(@RequestParam("keyvalue")String keywordsname) {
        Keywords keywords=new Keywords();
        keywords.setKeywords(keywordsname);
        Keywords keywords1=keywordsService.getKeywordsByKeyword(keywords);
        try{
            if (keywords1.getKeywords()!=null){
                return 1;
            }
        }catch (Exception e){
            return 0;
        }

        return 0;
    }
}
