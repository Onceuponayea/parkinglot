package com.smart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.smart.bean.LogBean;
import com.smart.bean.SearchConditionBean;

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
	public List<LogBean> selectMyLog(SearchConditionBean searchConditionBean);

	/**
	 * 查询总条数
	 */
	public int selectCount(SearchConditionBean searchConditionBean);

	/**
	 * 查询所有的操作名称
	 * 
	 * @return
	 */
	public List<String> selectLogNameList();
}
