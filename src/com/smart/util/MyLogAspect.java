package com.smart.util;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smart.bean.LogBean;
import com.smart.bean.UserBean;
import com.smart.dao.LogDaoInterface;

@Aspect
@Component
public class MyLogAspect {
	@Autowired
	private HttpSession session;
	@Resource
	private LogDaoInterface logDaoInterface;

	@After(value = "execution(* *.*(..))&&@annotation(com.smart.util.MyLog)")
	public void saveLog(JoinPoint joinPoint) throws NoSuchMethodException, SecurityException {
		System.out.println("进入记录日志方法");
		Method method = joinPoint.getTarget().getClass().getMethod(joinPoint.getSignature().getName());
		MyLog log = method.getAnnotation(MyLog.class);
		UserBean user = (UserBean) session.getAttribute("user");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String actioTime = simpleDateFormat.format(new Date());
		LogBean logbean = new LogBean(0, log.actionName(), actioTime, user);
		int n = logDaoInterface.insertToMyLog(logbean);
		if (n > 0) {
			System.out.println("日志记录成功！");
		} else {
			System.out.println("日志记录失败！");
		}
	}
}