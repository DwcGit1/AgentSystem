package com.csdj.service.ym;

import com.csdj.dao.ym.UserMapper;
import com.csdj.entity.Account;
import com.csdj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userservcie")
public class UserServcieimpl implements UserServcie {
	@Autowired
	public UserMapper userMapper;



	@Override
	public List<User> getUsers() {
		return userMapper.getUser();
	}

	@Override
	public int deleteUsers(int id) {
		return userMapper.deleteUser(id);
	}

	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public int updateUsers(User user) {
		return userMapper.updateUser(user);
	}


}
