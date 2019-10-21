package com.csdj.servlet.ym;

import com.csdj.entity.Account;
import com.csdj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.csdj.service.ym.UserServcie;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServcie userServcie;
    public void setUserService(UserServcie userService) {
        this.userServcie = userService;
    }
    /*显示所有用户信息*/
    @RequestMapping(value = "userShow")
    public String role(HttpServletRequest request){
        List<User> users=userServcie.getUsers();
        request.setAttribute("userNice",users);
        return "ym/User";
    }
    /*删除用户信息*/
    @RequestMapping(value = "deleteNice")
    public String delete(HttpServletRequest request, @RequestParam(required = false) int id){
        int con=userServcie.deleteUsers(id);
        request.setAttribute("userCode",id);
        System.out.println("删除==============================================>>>"+con);
        if(con>0){
            return "redirect:/user/userShow";
        }
        return "redirect:/user/userShow";
    }
    /*新增用户信息*/
    @RequestMapping(value = "addUser")
    public String add(HttpServletRequest request, User user){
        int con=userServcie.addUser(user);
        user.setCreatedBy("admin");
       /* user.setCreationTime(new Date());*/
        System.out.println("111111==============================================>>>"+user.getCreationTime());
        System.out.println("新增==============================================>>>"+con);
        System.out.println("新增是否启用==============================================>>>"+user.getIsStart());
        if(con>0){
            return "redirect:/user/userShow";
        }
        return "redirect:/user/userShow";
    }
    /*修改用户信息*/
    @RequestMapping(value = "updateUser")
    public String update(HttpServletRequest request, User user){
        int con=userServcie.updateUsers(user);
        System.out.println("id==============================================>>>"+user.getId());
        System.out.println("修改了==============================================>>>"+con);
        if(con>0){
            return "redirect:/user/userShow";
        }
        return "redirect:/user/userShow";
    }
}
