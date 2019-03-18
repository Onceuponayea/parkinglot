package com.smart.bean;

/**
 * 日志表
 * 
 * @author 86180
 *
 */
public class LogBean {
	private Integer logId;// 日志编号
	private String logName;// 日志名称
	private String logTime;// 操作时间
	private UserBean userBean;// 操作用户

	public LogBean() {
		super();
	}

	public LogBean(Integer logId, String logName, String logTime, UserBean userBean) {
		super();
		this.logId = logId;
		this.logName = logName;
		this.logTime = logTime;
		this.userBean = userBean;
	}

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getLogTime() {
		return logTime;
	}

	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	@Override
	public String toString() {
		return "LogBean [logId=" + logId + ", logName=" + logName + ", logTime=" + logTime + ", userBean=" + userBean
				+ "]";
	}

}
