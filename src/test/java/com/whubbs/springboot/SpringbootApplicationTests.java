package com.whubbs.springboot;

import com.whubbs.springboot.dao.BaseDao;
import com.whubbs.springboot.dao.userDao;
import com.whubbs.springboot.dao.userDaoImpl;
import com.whubbs.springboot.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringbootApplicationTests {
    @Test
    void connectText(){
        try {
            Connection c = BaseDao.getConnection();
        } catch (SQLException e) {
            System.out.println("连接数据库失败!!!");
            e.printStackTrace();
        }


    }
    @Test
    void contextLoads() {
        userDao dao = new userDaoImpl();
        User u = dao.getUser(7);
        System.out.println(u);
    }

}
