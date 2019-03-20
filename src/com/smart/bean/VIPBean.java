package com.smart.bean;

/**
 * 会员实体
 * 
 * @author 86180
 *
 */
public class VIPBean {
	private Integer vipId;// 会员Id
	private ComboBean comboBean;// 包月产品实体
	private CarBean carBean;// 汽车实体
	private String startTime;// 开始时间
	private String endTime;// 结束时间
	private String state;
	public VIPBean() {
		super();
	}

	
	public VIPBean(Integer vipId, ComboBean comboBean, CarBean carBean, String startTime, String endTime,
			String state) {
		super();
		this.vipId = vipId;
		this.comboBean = comboBean;
		this.carBean = carBean;
		this.startTime = startTime;
		this.endTime = endTime;
		this.state = state;
	}


	public Integer getVipId() {
		return vipId;
	}

	public void setVipId(Integer vipId) {
		this.vipId = vipId;
	}

	public ComboBean getComboBean() {
		return comboBean;
	}

	public void setComboBean(ComboBean comboBean) {
		this.comboBean = comboBean;
	}

	public CarBean getCarBean() {
		return carBean;
	}

	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "VIPBean [vipId=" + vipId + ", comboBean=" + comboBean + ", carBean=" + carBean + ", startTime="
				+ startTime + ", endTime=" + endTime + ", state=" + state + "]";
	}

	

}
