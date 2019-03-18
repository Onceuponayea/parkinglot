package com.smart.dao;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.smart.bean.User;

@Controller
public interface UserDaoInterface {
	public List<User> findUser();// ÓÃ»§µÇÂ¼

}
