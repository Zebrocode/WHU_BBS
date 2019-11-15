package com.whubbs.springboot.service.impl;

import com.whubbs.springboot.dao.UserDao;
import com.whubbs.springboot.domain.User;
import com.whubbs.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;

public class UserServiceImpl implements UserService {


	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userDao.addUser(user);

	}

	@Override
	public User getUserByName(String name) {
		return userDao.getUserbyName(name);
	}
}
