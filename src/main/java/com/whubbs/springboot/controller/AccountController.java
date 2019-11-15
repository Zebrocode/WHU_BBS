package com.whubbs.springboot.controller;

import com.whubbs.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@Autowired
	AccountService accountService;

	@GetMapping("/test")
	public String test(){
		System.out.println(accountService.findAll());
		return "ok";
	}
}
