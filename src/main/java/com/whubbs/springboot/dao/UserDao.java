package com.whubbs.springboot.dao;

import com.whubbs.springboot.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Select("select * from user")
    List<User> getUser();

    @Select("select * from user where name = #{name}")
    User getUserbyName(String name);

    void addUser(User user);

    void updateUser();
}
