package com.whubbs.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;

@Controller//RestController 返回文字 Controller可以去找jsp
public class HelloController {
    @RequestMapping("/")
    public String Home(Model m) {
//        m.addAttribute("name", "thymeleaf");
        return "home";
    }

}
