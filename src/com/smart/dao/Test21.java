package com.smart.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.bean.User;

public class Test21 {
//	@Resource
//	private UserDaoInterface userDaoInterface;


	public static void main(String[] args) {
		ApplicationContext conf = new ClassPathXmlApplicationContext("applicationContext.xml");
		DefaultSqlSessionFactory bean = (DefaultSqlSessionFactory) conf.getBean("sqlSessionFactory");
		SqlSession session = bean.openSession();
		System.out.println(session);
		UserDaoInterface dao = session.getMapper(UserDaoInterface.class);
		System.out.println(dao);
		List<User> list = dao.findUser();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
