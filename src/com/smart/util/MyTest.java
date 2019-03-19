package com.smart.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import com.smart.bean.UserBean;

@RequestMapping("/")
@Component
public class MyTest {
	@Autowired
	HttpSession session;
	@RequestMapping("mytest")

	@MyLog(actionName = "用户登录")
	public void tsetCase() {
		UserBean userBean = new UserBean();
		userBean.setUserId(5);;
		userBean.setUserName("新桂");
		session.setAttribute("user", userBean);

	}


	
	
	
	
}
