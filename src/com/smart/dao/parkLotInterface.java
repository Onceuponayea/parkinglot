package com.smart.dao;

import java.util.List;

import com.smart.bean.UserBean;

public interface parkLotInterface {

	public List<UserBean> findUser();
	
	public int adduser(UserBean userBean);
	
	public int updateTest(UserBean userBean);

}
