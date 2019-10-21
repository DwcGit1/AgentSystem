package com.csdj.service.dwc.login;

import com.csdj.entity.User;

public interface LoginService {

    public User UserLogin(String userCode, String userPassword);
}
