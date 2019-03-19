package com.smart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.smart.bean.LogBean;

@Repository
public interface LogDaoInterface {
	/**
	 * 插入日志到日志表
	 * 
	 * @return
	 */
	public int insertToMyLog(LogBean logBean);

	/**
	 * 查询日志表
	 * 
	 * @return
	 */
	public List<LogBean> selectMyLogq(LogBean logBean);
}
