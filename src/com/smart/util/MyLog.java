package com.smart.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 日志操作
 * 
 * @author 86180
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLog {
	/**
	 * 操作类型（“登录、退出等”）
	 * 
	 * @return
	 */
	public String actionType();

	/**
	 * 操作名称（“修改数据库等”）
	 * 
	 * @return
	 */
	public String actionName();
}
