package com.whubbs.springboot.dao;

import com.whubbs.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    User getUser(Integer id);
}
