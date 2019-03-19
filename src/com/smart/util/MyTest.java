package com.smart.util;

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
	@MyLog(actionName = "用户登录", actionType = "我自己登录")
	public void tsetCase() {
		System.out.println("有没有进来？");
		UserBean userBean = new UserBean();
		userBean.setUserID(5);
		userBean.setUserName("新桂");
		login();
		// ActionContext.getContext().getSession().put("user", userBean);

	}

	@Test
	public void login() {
		UserBean userBean = new UserBean();
		userBean.setUserID(5);
		userBean.setUserName("新桂");
		System.out.println();
		session.setAttribute("user", userBean);
		// ActionContext.getContext().getSession().put("user", userBean);
	}

}
