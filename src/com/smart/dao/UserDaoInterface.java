package com.smart.dao;

import org.springframework.stereotype.Repository;

import com.smart.bean.UserBean;

@Repository
public interface UserDaoInterface {
	public UserBean findUser();
}
