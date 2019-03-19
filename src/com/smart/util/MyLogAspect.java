package com.smart.util;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smart.bean.UserBean;

@Aspect
@Component
public class MyLogAspect {
	@Autowired
	HttpSession session;

	@After(value = "execution(* *.*(..))&&@annotation(com.smart.util.MyLog)")
	public void saveLog(JoinPoint joinPoint) throws NoSuchMethodException, SecurityException {
		System.out.println("进入日志方法");
		Method method = joinPoint.getTarget().getClass().getMethod(joinPoint.getSignature().getName());
		MyLog log = method.getAnnotation(MyLog.class);
		UserBean user = (UserBean) session.getAttribute("user");
		// UserBean user = (UserBean)
		// ActionContext.getContext().getSession().get("user");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String actioTime = simpleDateFormat.format(new Date());
		System.out.println("用户名：" + user.getUserName());
		System.out.println("操作类型：" + log.actionName());
		System.out.println("操作名称：" + log.actionType());
		System.out.println("操作时间：" + actioTime);
	}
}