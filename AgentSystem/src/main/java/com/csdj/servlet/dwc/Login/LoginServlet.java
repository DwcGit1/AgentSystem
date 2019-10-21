package com.csdj.servlet.dwc.Login;

import com.csdj.entity.User;
import com.csdj.service.dwc.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginServlet {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value="/user/dologin.html",method= RequestMethod.POST)
    public String UserLogin(@RequestParam("userCode") String userCode, @RequestParam("userPassword") String userPassword, HttpServletRequest request){
        User user=loginService.UserLogin(userCode,userPassword);
        if(user != null){
            HttpSession session=request.getSession();
            session.setAttribute("users", user);
            return "AgentSystemHead";
        }else{
            request.setAttribute("erorr", "对不起，你的用户名或密码有错误！");
            return  "login";
        }
    }
}
