package com.smart.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeUtil {
	//时间格式包括年月日时分秒
	public static SimpleDateFormat sdfForSecond = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//时间格式只包括年月日
	public static SimpleDateFormat sdfForDay = new SimpleDateFormat("yyyy-MM-dd");
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
			long from = sdfForSecond.parse(fromDate).getTime();
			long to = sdfForSecond.parse(toDate).getTime();
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
