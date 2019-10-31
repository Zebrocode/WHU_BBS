package com.whubbs.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller//RestController 返回文字 Controller可以去找jsp
public class LoginController {
    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String Login(HttpServletRequest request){
        String account = request.getParameter("u");
        String password = request.getParameter("p");
        //验证数据库中是否有该账户密码组合;
        System.out.println("user:"+account+"\n"+"password:"+password);
        return "LoginCons.html";
    }
}
