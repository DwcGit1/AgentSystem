package com.csdj.servlet.dwc.logs;

import com.csdj.service.dwc.logs.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/sys")
public class LogsServlet {

    @Autowired
    private LogsService logsService;

    @RequestMapping(value = "/showLogs.html",method = {RequestMethod.GET,RequestMethod.POST})
    public String showLogs(){
        return "Logs";
    }

    @RequestMapping(value = "/showLogs.json",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> getAccountDetail(@RequestParam int page, @RequestParam int limit){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",logsService.getLogsCount());
        map.put("data",logsService.getLogs(page,limit));
        return map;
    }
}
