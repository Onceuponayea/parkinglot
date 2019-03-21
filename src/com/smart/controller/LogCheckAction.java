package com.smart.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.smart.bean.LogBean;
import com.smart.bean.SearchConditionBean;
import com.smart.dao.LogDaoInterface;

import net.sf.json.JSONArray;

/**
 * 日志Action
 * 
 * @author 86180
 *
 */
@RequestMapping("/")
@Controller
public class LogCheckAction {
	@Resource
	private LogDaoInterface logDaoInterface;

	/**
	 * 跳转到日志查看界面
	 * 
	 * @return
	 */
	@RequestMapping("checkLog")
	public ModelAndView toJsp() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("logNameList", logDaoInterface.selectLogNameList());
		modelAndView.setViewName("checklog");
		return modelAndView;
	}

	/**
	 * 查找日志列表
	 * 
	 * @return
	 */
	@RequestMapping("findLogList")
	public @ResponseBody Map<String, Object> findLogList(SearchConditionBean searchCon) {
		System.out.println("进入日志查看1");
		searchCon.setEndTime(searchCon.getEndTime() + " 3");
		searchCon.setPage((searchCon.getPage() - 1) * searchCon.getLimit());
		System.out.println("searchConditionBean===" + searchCon);
		List<LogBean> logList = logDaoInterface.selectMyLog(searchCon);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", logDaoInterface.selectCount(searchCon));
		map.put("data", logList);
		return map;
	}

}
