package com.csdj.dao.ym;

import com.csdj.entity.Account;
import com.csdj.entity.User;

import java.util.List;


public interface UserMapper {


     /*显示所有用户信息*/
     List<User> getUser();
     /*删除用户信息*/
     int deleteUser(int id);
     /*新增用户*/
     int addUser(User user);
     /*修改用户信息*/
     int updateUser(User user);
     /*显示所有角色信息*/

}





