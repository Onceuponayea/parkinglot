package com.smart.util;

import java.text.ParseException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.bean.CarBean;
import com.smart.bean.VIPBean;
import com.smart.dao.VipDaoInterface;
import com.smart.dao.parkLotInterface;

public class Test implements ServletContextListener{
//	private Timer timer = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DefaultSqlSessionFactory bean = (DefaultSqlSessionFactory) context.getBean("sqlSessionFactory");
		SqlSession session = bean.openSession();
		VipDaoInterface vipDaoInterface = session.getMapper(VipDaoInterface.class);
		VIPBean vipBean = new VIPBean();
		vipBean.setCarBean(new CarBean());
		vipBean.getCarBean().setCarNum("闽D88888");
		vipBean.setState("已生效");
		VIPBean vipBean1 = vipDaoInterface.findVipByCarAndState(vipBean);
		System.out.println(vipBean1.getCarBean().getCarId());
//		try {
//			long time = TimeUtil.sdfForSecond.parse("2019-03-21 00:00:01").getTime();
//			System.out.println(time/1000%86400-57600);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
//		timer.cancel();
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
//		timer = new Timer();
		
//		try {
//			timer.schedule(new TimerTask() {
//				
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
					System.out.println("123");
//				}
//			},TimeUtil.sdfForSecond.parse("2019-03-19 17:31:00") , 86400000);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
