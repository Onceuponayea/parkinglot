package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class HomeController {
	@RequestMapping("test")
	public ModelAndView hello() {
		ModelAndView andView = new ModelAndView();
		andView.addObject("user", "уехЩ");
		andView.setViewName("success");
		return andView;
	}
}
