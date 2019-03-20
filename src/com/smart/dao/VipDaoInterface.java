package com.smart.dao;

import com.smart.bean.VIPBean;

public interface VipDaoInterface {
	public int insertVip(VIPBean vipBean);
	public VIPBean findVipByCarAndState(VIPBean vipBean);
}
