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
import com.smart.dao.ParkDaoInterface;

@RequestMapping("/map")
@Controller
public class MapAction {
	@Resource
	private ParkDaoInterface parkDaoInterface;

	@RequestMapping("mapAction")
	public ModelAndView map() {
		String city=parkDaoInterface.findCityByParanName("所在城市");
		String address=parkDaoInterface.findCityByParanName("公司位置");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("city", city);
		modelAndView.addObject("address", address);
		modelAndView.setViewName("mapnavigation");
		return modelAndView;
	}

	
}
