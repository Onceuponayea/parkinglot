package com.smart.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smart.bean.LogBean;
import com.smart.bean.MenuBean;
import com.smart.bean.SearchConditionBean;
import com.smart.bean.UserBean;
import com.smart.dao.LogDaoInterface;
import com.smart.dao.MenuDaoInterface;

@RequestMapping("/")
@Component
public class MyTest {
	@Autowired
	HttpSession session;

	@RequestMapping("mytest")
	@MyLog(actionName = "用户登录")
	public void tsetCase() {
		UserBean userBean = new UserBean();
		userBean.setUserId(5);
		;
		userBean.setUserName("新桂");
		session.setAttribute("user", userBean);

	}

	public ModelAndView getMenuByUser(UserBean userBean) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", "123");
		return modelAndView;
	}

	@RequestMapping("login")
	public ModelAndView loginAction(UserBean userBean) {
		ModelAndView modelAndView = getMenuByUser(userBean);
		modelAndView.setViewName("success");
		return modelAndView;
	}

	/**
	 * 这是qxg写的一个测试数据库操作的方法
	 */
	public static void main(String[] args) {
		ApplicationContext conf = new ClassPathXmlApplicationContext("applicationContext.xml");
		DefaultSqlSessionFactory bean = (DefaultSqlSessionFactory) conf.getBean("sqlSessionFactory");
		SqlSession sqlSession = bean.openSession();
		MenuDaoInterface dao = sqlSession.getMapper(MenuDaoInterface.class);
		LogDaoInterface daoInterface = sqlSession.getMapper(LogDaoInterface.class);
		SearchConditionBean s = new SearchConditionBean("", "用户登录", "2019-03-10", "2019-03-20", 0, 5);
		// System.out.println( daoInterface.selectCount(s));
		List<String> l = daoInterface.selectLogNameList();
		for (String string : l) {
			System.out.println(string);
		}
		// List<LogBean> lll = daoInterface.selectMyLog(s);
		// for (LogBean logBean : lll) {
		// System.out.println(logBean);
		// }
		// UserBean userBean = new UserBean(null, "youshenxu", null, null, null,
		// null, null);
		// List<String> list = dao.selectFirstMenu(userBean);
		// for (String firstMenu : list) {
		// System.out.println(firstMenu);
		// List<MenuBean> list1 = dao.selectSecondMenu(userBean.getUserName(),
		// firstMenu);
		// for (MenuBean menuBean : list1) {
		// System.out.println(menuBean);
		// }
		// }
	}

}
