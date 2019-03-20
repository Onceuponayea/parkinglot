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

import com.smart.bean.LogBean;
import com.smart.bean.SearchConditionBean;
import com.smart.bean.UserBean;
import com.smart.dao.LogDaoInterface;

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

	/**
	 * 这是qxg写的一个测试数据库操作的方法
	 */
	public static void main(String[] args) {
		ApplicationContext conf = new ClassPathXmlApplicationContext("applicationContext.xml");
		DefaultSqlSessionFactory bean = (DefaultSqlSessionFactory) conf.getBean("sqlSessionFactory");
		SqlSession sqlSession = bean.openSession();
		LogDaoInterface dao = sqlSession.getMapper(LogDaoInterface.class);
		SearchConditionBean s = new SearchConditionBean("", "用户登录", "2019-03-10", "2019-03-20", 1, 5);
		List<LogBean> list = dao.selectMyLog(s);
		for (LogBean logBean : list) {
			System.out.println(logBean);
		}
	}

}
