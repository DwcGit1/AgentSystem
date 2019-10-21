package com.csdj.servlet.dwc.accountdetail;

import com.csdj.entity.AccountDetail;
import com.csdj.service.dwc.accountdetail.AccountDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sys")
public class AccountDetailServlet {

    @Autowired
    private AccountDetailService accountDetailService;

    @RequestMapping(value = "/showAccountDetailService.html",method = RequestMethod.GET)
    public String showviewAccountDetails(){
        return "viewAccountDetails";
    }

    @RequestMapping(value = "/showAccountDetailService.json",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getAccountDetail(@RequestParam int page,@RequestParam int limit){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",accountDetailService.getAccountDetailCount());
        map.put("data",accountDetailService.getAccountDetail(page,limit));
        return map;
    }
}
