package com.smart.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smart.bean.MenuBean;
import com.smart.bean.UserBean;
import com.smart.dao.MenuDaoInterface;

@RequestMapping("/user")
@Controller
public class LoginAction {
	@Resource
	private MenuDaoInterface menuDaoInterface;

	@RequestMapping("loginAction")
	public ModelAndView login() {
		System.out.println("进入登录的方法" + menuDaoInterface);
		UserBean userBean = new UserBean(null, "youshenxu", null, null, null, null, null);
		Map<Object, Object> map = findMenuList(userBean);
		System.out.println("map====" + map);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("map", map);
		modelAndView.setViewName("index");
		return modelAndView;
	}

	public Map<Object, Object> findMenuList(UserBean userBean) {
		Map<Object, Object> map = new HashMap<>();
		List<String> list = menuDaoInterface.selectFirstMenu(userBean);
		for (String firstMenu : list) {
			System.out.println(firstMenu);
			List<MenuBean> secMenuList = menuDaoInterface.selectSecondMenu(userBean.getUserName(), firstMenu);
			map.put(firstMenu, secMenuList);
			for (MenuBean menuBean : secMenuList) {
				System.out.println(menuBean);
			}
		}
		return map;
	}
}
