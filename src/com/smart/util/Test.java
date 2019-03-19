package com.smart.util;

import java.text.ParseException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Test implements ServletContextListener{
//	private Timer timer = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long time = TimeUtil.sdfForSecond.parse("2019-03-21 00:00:01").getTime();
			System.out.println(time/1000%86400-57600);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
