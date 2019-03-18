package com.smart.bean;

/**
 * 排班表
 * 
 * @author 86180
 *
 */
public class ScheBean {
	private Integer scheId;// 排班Id
	private String date;// 排班日期
	private AreaBean area;// 区域表
	private UserBean userBean;// 用户实体
	private ScheTimeBean scheTime;// 时间段

	public ScheBean() {
		super();
	}

	public ScheBean(Integer scheId, String date, AreaBean area, UserBean userBean, ScheTimeBean scheTime) {
		super();
		this.scheId = scheId;
		this.date = date;
		this.area = area;
		this.userBean = userBean;
		this.scheTime = scheTime;
	}

	public Integer getScheId() {
		return scheId;
	}

	public void setScheId(Integer scheId) {
		this.scheId = scheId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public AreaBean getArea() {
		return area;
	}

	public void setArea(AreaBean area) {
		this.area = area;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public ScheTimeBean getScheTime() {
		return scheTime;
	}

	public void setScheTime(ScheTimeBean scheTime) {
		this.scheTime = scheTime;
	}

	@Override
	public String toString() {
		return "ScheBean [scheId=" + scheId + ", date=" + date + ", area=" + area + ", userBean=" + userBean
				+ ", scheTime=" + scheTime + "]";
	}

}
