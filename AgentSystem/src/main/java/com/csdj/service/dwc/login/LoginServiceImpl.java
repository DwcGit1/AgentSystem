package com.csdj.service.dwc.login;

import com.csdj.dao.dwc.login.LoginMapper;
import com.csdj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
@Service("loginService")
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User UserLogin(String userCode, String userPassword) {
        return loginMapper.userLogin(userCode,userPassword);
    }
}
