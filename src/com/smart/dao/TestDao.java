package com.smart.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.config.ConfigurationManager;
import com.smart.bean.UserBean;
/**
 * 
 * 测试用的Test，请无视
 * 
 * */
public class TestDao {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DefaultSqlSessionFactory bean = (DefaultSqlSessionFactory) context.getBean("sqlSessionFactory");
		SqlSession session = bean.openSession();
//		
		parkLotInterface parkLotInterface = session.getMapper(parkLotInterface.class);
//▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽改▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽		
//		UserBean userBean = new UserBean();
//		userBean.setUserName("友慎♂新桂");
//		userBean.setUserID(6);
//	    int a = parkLotInterface.updateTest(userBean);
//		System.out.println(a);
//△△△△△△△△△△△△△△△△△△△△△△△△改△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△		
		
		
//------------------------------增---------------------------------
		
//		UserBean userBean = new UserBean();                      
//		userBean.setUserName("123");
//		userBean.setPassword("123456");
//		int o = parkLotInterface.adduser(userBean);
//        System.out.println(o);
//------------------------------增----------------------------------
		
		
		
		
//******************************查**********************************		
//		List<UserBean> userBean = parkLotInterface.findUser();
//		for (UserBean userBean2 : userBean) {
//			System.out.println(userBean2.getUserID());
//			System.out.println(userBean2.getUserName());
//******************************查**********************************	
//		}

	}
}
