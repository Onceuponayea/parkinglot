package com.smart.bean;

/**
 * 停车表实体
 * 
 * @author 86180
 *
 */
public class StopBean {
	private Integer stopId;// 停车ID
	private CarBean carBean;// 汽车实体
	private String startTime;// 开始时间
	private String endTime;// 结束时间
	private String money;// 金额

	public StopBean() {
		super();
	}

	public StopBean(Integer stopId, CarBean carBean, String startTime, String endTime, String money) {
		super();
		this.stopId = stopId;
		this.carBean = carBean;
		this.startTime = startTime;
		this.endTime = endTime;
		this.money = money;
	}

	public Integer getStopId() {
		return stopId;
	}

	public void setStopId(Integer stopId) {
		this.stopId = stopId;
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

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "StopBean [stopId=" + stopId + ", carBean=" + carBean + ", startTime=" + startTime + ", endTime="
				+ endTime + ", money=" + money + "]";
	}

}
