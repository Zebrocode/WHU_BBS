package com.whubbs.springboot.web;

import com.whubbs.springboot.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller//RestController 返回文字 Controller可以去找jsp
public class LoginController {
    @RequestMapping(value="/login",method = RequestMethod.POST)//增加themeleaf之后可以用POST了,不加只能用GET
    public String Login(HttpServletRequest request, Model m){
        String account = request.getParameter("u");
        String password = request.getParameter("p");
        //验证数据库中是否有该账户密码组合;

        System.out.println("user:"+account+"\n"+"password:"+password);
        m.addAttribute("user",account);
        return "loginH";
    }
}
