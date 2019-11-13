package com.whubbs.springboot.dao;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.whubbs.springboot.domain.User;
import org.springframework.util.ReflectionUtils;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class userDaoImpl implements userDao {
    @Override
    public User getUser(Integer id) {
        User user = null;
        try (Connection c = BaseDao.getConnection()) {
            System.out.println("--------coming in---------------!");
            String sql = "select * from user where id = (?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            user = new User();
            while (rs.next()){
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setAddtime(rs.getDate(4));
                user.setJurisdiciton(rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
