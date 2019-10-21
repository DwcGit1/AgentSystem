package com.csdj.servlet.dwc.serve;

import com.csdj.entity.SystemConfig;
import com.csdj.service.dwc.serve.ServeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/sys")
@Controller
public class ServeServlet {

    @Autowired
    private ServeService serveService;

    @RequestMapping(value ="/kehu.json")
    @ResponseBody
    public List<SystemConfig> kehu(){
        return  serveService.showkehu();
    }

    @RequestMapping(value ="/serveupdate.json")
    @ResponseBody
    public List<SystemConfig> serve(ModelAndView modelAndView,@RequestParam("id") int id){
        return  serveService.selectid(id);
    }

    @RequestMapping(value ="/kehuupdate.json")
    public ModelAndView fuwuapdatesfd(ModelAndView modelAndView,SystemConfig systemConfig ){
        boolean trueandfalse=serveService.kehuupdate(systemConfig);
        if(trueandfalse){
            modelAndView.setViewName("kehu");
        }else{
            System.out.println("修改失败");
        }
        return  modelAndView;
    }

    @RequestMapping(value ="/kehuadd.json")
    public ModelAndView kehuadd(ModelAndView modelAndView,SystemConfig systemConfig ){
        boolean trueandfalse=serveService.kehuadd(systemConfig);
        if(trueandfalse){
            modelAndView.setViewName("kehu");
        }else{
            System.out.println("修改失败");
        }
        return  modelAndView;
    }

    @RequestMapping(value="/del.json")
    public ModelAndView asd(ModelAndView modelAndView, @RequestParam("id") int id){
        System.out.println("sad");
        boolean trueandfalse=serveService.kehudel(id);
        if(trueandfalse){
            modelAndView.setViewName("kehu");
        }
        return  modelAndView;
    }

    @RequestMapping(value ="/sfzshow.json")
    @ResponseBody
    public List<SystemConfig> sfz(){
        return  serveService.sfzshow();
    }

    @RequestMapping(value ="/sfzid.json")
    @ResponseBody
    public List<SystemConfig> sfzid(ModelAndView modelAndView,@RequestParam("id") int id){
        return  serveService.sfzid(id);
    }

    @RequestMapping(value="/sfzdel.json")
    public  ModelAndView sfzdel(ModelAndView modelAndView,@RequestParam("id") int id){

        boolean trueandfalse=serveService.sfzdel(id);
        if(trueandfalse){
            modelAndView.setViewName("sfz");
        }
        return  modelAndView;
    }

    @RequestMapping(value ="/sfzupdate.json")
    public ModelAndView sfzupdate(ModelAndView modelAndView,SystemConfig systemConfig ){
        boolean trueandfalse=serveService.sfzupdate(systemConfig);
        if(trueandfalse){
            modelAndView.setViewName("sfz");
        }else{
            System.out.println("修改失败");
        }
        return  modelAndView;
    }

    @RequestMapping(value ="/sfzadd.json")
    public ModelAndView sfzadd(ModelAndView modelAndView,SystemConfig systemConfig ){
        boolean trueandfalse=serveService.sfzadd(systemConfig);
        if(trueandfalse){
            modelAndView.setViewName("sfz");
        }else{
            System.out.println("修改失败");
        }
        return  modelAndView;
    }

    @RequestMapping(value ="/youhuishow/json")
    @ResponseBody
    public List<SystemConfig> youhuishow(){
        return  serveService.youhuishow();
    }

    @RequestMapping(value ="/youhuiid.json")
    @ResponseBody
    public List<SystemConfig> youhuiid(ModelAndView modelAndView,@RequestParam("id") int id){
        return  serveService.youhuiid(id);
    }

    @RequestMapping(value="/youhuidel.json")
    public  ModelAndView youhuidel(ModelAndView modelAndView,@RequestParam("id") int id){

        boolean trueandfalse=serveService.youhuidel(id);
        if(trueandfalse){
            modelAndView.setViewName("youhu");
        }
        return  modelAndView;
    }

    @RequestMapping(value ="/youhuiupdate.json")
    public ModelAndView youhuiupdate(ModelAndView modelAndView,SystemConfig systemConfig ){
        boolean trueandfalse=serveService.youhuiupdate(systemConfig);
        if(trueandfalse){
            modelAndView.setViewName("youhu");
        }else{
            System.out.println("修改失败");
        }
        return  modelAndView;
    }

    @RequestMapping(value ="/youhuiadd.json")
    public ModelAndView youhuiadd(ModelAndView modelAndView,SystemConfig systemConfig ){
        boolean trueandfalse=serveService.youhuiadd(systemConfig);
        if(trueandfalse){
            modelAndView.setViewName("youhu");
        }else{
            System.out.println("修改失败");
        }
        return  modelAndView;
    }
}
