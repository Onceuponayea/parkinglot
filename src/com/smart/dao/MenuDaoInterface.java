package com.smart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.smart.bean.MenuBean;
import com.smart.bean.UserBean;

/**
 * 菜单dao
 * 
 * @author 86180
 *
 */
@Repository
public interface MenuDaoInterface {
	/**
	 * 查找一级菜单
	 */
	public List<String> selectFirstMenu(UserBean userBean);
	/**
	 * 查找二级菜单
	 */
	public List<MenuBean> selectSecondMenu(String firstMenuName);
}
