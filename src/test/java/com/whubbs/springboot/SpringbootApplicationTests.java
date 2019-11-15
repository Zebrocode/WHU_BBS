package com.whubbs.springboot;

import com.whubbs.springboot.dao.AccountDao;
import com.whubbs.springboot.dao.UserDao;
import com.whubbs.springboot.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootApplicationTests {

    @Autowired
    AccountDao accountDao;

    @Autowired
    UserDao userDao;



    @Test
    void test() {
        // System.out.println(accountDao.findAll());
        User user = new User();
        user.setName("zytt");
        user.setPassword("123456");
        userDao.addUser(user);

        System.out.println(userDao.getUser());
    }


}
