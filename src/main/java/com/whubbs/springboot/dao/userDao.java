package com.whubbs.springboot.dao;

import com.whubbs.springboot.domain.User;

public interface userDao {
    User getUser(Integer id);
}
