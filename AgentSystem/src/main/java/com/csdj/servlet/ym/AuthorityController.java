package com.csdj.servlet.ym;

import com.csdj.entity.JsonToolsGet;
import com.csdj.entity.Premission;
import com.csdj.entity.Role;
import com.csdj.service.ym.SystemAuthorityService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *  角色权限配置
 */
@Controller
@RequestMapping(value = "authority")
public class AuthorityController {

    @Resource
    private SystemAuthorityService authorityService;


    @RequestMapping(value = "/authority.html")
    public String authority(){
        return "ym/authority";
    }

    @RequestMapping(value = "GetRoleName")
    @ResponseBody
    public List<Role> GetRoleName(){
        return authorityService.GetRoleName();
    }

    @RequestMapping(value = "/showFunctionId.json")
    @ResponseBody
    public List<Integer> showFunction(@RequestParam int roleId){
        return authorityService.show_FunctionId(roleId);
    }

    @RequestMapping(value = "/showFunction.json")
    @ResponseBody
    public Map<String,Object> showFunction(){
        return JsonToolsGet.jsonData(authorityService.show_All_Function().size(),authorityService.show_All_Function());
    }

    @RequestMapping(value = "/updFunction.html")
    public String updFunction(Premission premission){
        System.out.println("进来了");
        Integer id = authorityService.show_Id(premission.getRoleId(),premission.getFunctionId());
        if (id!=null && premission.getIsStart()==0){
            authorityService.del_Premission(id);
        }else if (id==null){
            premission.setCreatedBy("admin");
            premission.setCreationTime(new Date());
            authorityService.add_Premission(premission);
        }
        return "redirect:/authority/authority.html";
    }


}
