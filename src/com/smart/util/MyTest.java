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
	@MyLog(actionName = "用户登录", actionType = "我自己登录")
	public void tsetCase() {
		System.out.println("有没有进来？");
		UserBean userBean = new UserBean();
		userBean.setUserID(5);
		userBean.setUserName("是开1");
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
	
	
	
	public static SimpleDateFormat sdfForSecond = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//时间格式包括年月日时分秒
	public static SimpleDateFormat sdfForDay = new SimpleDateFormat("yyyy-MM-dd");//时间格式只包括年月日
	
	//获取当前时间，时间格式自己设定
	public static String currentDate(SimpleDateFormat sdf){
		String currentDate = sdf.format(new Date());
		return currentDate;
	}
	
	//获取afterDay天后的时间，curretDate为比对时间，用于vip的办理（ps:sdf的格式要比curretDate所显示的格式一致或简略）
	public static String afterDate(SimpleDateFormat sdf,String currentDate,int afterDay){
		Calendar calendar = Calendar.getInstance();
		Date date = null;
		try {
			date = sdf.parse(currentDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calendar.setTime(date);
		int day = calendar.get(Calendar.DATE);
		calendar.set(Calendar.DATE,day+afterDay);
		String afterDate = sdf.format(calendar.getTime());
		return afterDate;
	}
	
	
	//停车时长差，存在map里，键值hour（int），min（int），sec（int），duration（String）对应时分秒与总时长
	public static Map<String, Object> duration(String fromDate,String toDate){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			long from = MyTest.sdfForSecond.parse(fromDate).getTime();
			long to = MyTest.sdfForSecond.parse(toDate).getTime();
			long total = (to-from)/1000;//总共的秒数
			int hour = (int) (total/3600);//小时
			int min = (int)total%3600/60;//分钟
			int sec = (int)total%3600%60;//秒数
			String duration = hour+"时"+min+"分"+sec+"秒";
			map.put("hour", hour);
			map.put("min", min);
			map.put("sec", sec);
			map.put("duration", duration);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
