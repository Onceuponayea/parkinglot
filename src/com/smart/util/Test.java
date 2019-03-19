package com.smart.util;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fromDate = MyTest.currentDate(MyTest.sdfForSecond);
		String toDate = MyTest.afterDate(MyTest.sdfForSecond, fromDate, 20);
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			long from = MyTest.sdfForSecond.parse(fromDate).getTime();
			long to = MyTest.sdfForSecond.parse(toDate).getTime();
			long mid = (to-from)/1000;
			long hour = mid/3600;
			long min = mid%3600/60;
			long sec = mid%3600%60;
			String duration = hour+"时"+min+"分"+sec+"秒";
			map.put("hour", hour);
			map.put("min", min);
			map.put("sec", sec);
			map.put("duration", duration);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
