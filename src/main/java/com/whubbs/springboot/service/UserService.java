package com.whubbs.springboot.service;

import com.whubbs.springboot.domain.User;

public interface UserService {
	void addUser(User user);

	User getUserByName(String name);
}
