package com.csdj.service.ym;

import com.csdj.entity.Account;
import com.csdj.entity.User;

import java.util.List;


public interface UserServcie {

    List<User> getUsers();
    int deleteUsers(int id);
    int addUser(User user);
    int updateUsers(User user);
}
