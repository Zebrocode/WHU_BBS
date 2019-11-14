package com.whubbs.springboot.service.impl;

import com.whubbs.springboot.dao.AccountDao;
import com.whubbs.springboot.domain.Account;
import com.whubbs.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao accountDao;
	@Override
	public List<Account> findAll() {
		return accountDao.findAll();
	}
}
