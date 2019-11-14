package com.whubbs.springboot.dao;

import com.whubbs.springboot.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountDao {

	@Select("select * from test")
	public List<Account> findAll();
}
