package com.whubbs.springboot.controller;

import com.whubbs.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller//RestController 返回文字 Controller可以去找jsp
public class LoginController {

    @PostMapping("login")
    public String Login(User user, Model model){
        System.out.println(user);
        // String account = request.getParameter("u");
        // String password = request.getParameter("p");
        // //验证数据库中是否有该账户密码组合;
        //
        // System.out.println("user:"+account+"\n"+"password:"+password);
        model.addAttribute("user",user);
        return "loginH";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "ok";

    }
}
