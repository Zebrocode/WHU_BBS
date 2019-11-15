package com.whubbs.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//RestController 返回文字 Controller可以去找jsp
public class HelloController {
    @RequestMapping("/")
    public String Home(Model m) {
//        m.addAttribute("name", "thymeleaf");
        return "home";
    }

}
