package com.smart.bean;

/**
 * 查询条件实体
 * 
 * @author 86180
 *
 */
public class SearchConditionBean {
	private String userName;// 用户姓名
	private String logName;// 操作名称
	private String beginDate;// 开始时间
	private String endTime;// 结束时间
	private int page;// 当前页
	private int limit;// 每页显示总条数

	public SearchConditionBean() {
		super();
	}

	public SearchConditionBean(String userName, String logName, String beginDate, String endTime, int page, int limit) {
		super();
		this.userName = userName;
		this.logName = logName;
		this.beginDate = beginDate;
		this.endTime = endTime;
		this.page = page;
		this.limit = limit;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "SearchConditionBean [userName=" + userName + ", logName=" + logName + ", beginDate=" + beginDate
				+ ", endTime=" + endTime + ", page=" + page + ", limit=" + limit + "]";
	}

}
