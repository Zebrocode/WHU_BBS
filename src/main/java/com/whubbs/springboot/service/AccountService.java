package com.whubbs.springboot.service;

import com.whubbs.springboot.domain.Account;

import java.util.List;

public interface AccountService {
	List<Account> findAll();
}
