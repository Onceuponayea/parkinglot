package com.smart.bean;

/**
 * 预约实体表
 * 
 * @author 86180
 *
 */
public class AppointmentBean {
	private Integer appointId;// 预约Id
	private CustBean custBean;// 车主实体
	private CarBean carBean;// 汽车实体
	private String time;// 预约时间

	public AppointmentBean() {
		super();
	}

	public AppointmentBean(Integer appointId, CustBean custBean, CarBean carBean, String time) {
		super();
		this.appointId = appointId;
		this.custBean = custBean;
		this.carBean = carBean;
		this.time = time;
	}

	public Integer getAppointId() {
		return appointId;
	}

	public void setAppointId(Integer appointId) {
		this.appointId = appointId;
	}

	public CustBean getCustBean() {
		return custBean;
	}

	public void setCustBean(CustBean custBean) {
		this.custBean = custBean;
	}

	public CarBean getCarBean() {
		return carBean;
	}

	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "AppointmentBean [appointId=" + appointId + ", custBean=" + custBean + ", carBean=" + carBean + ", time="
				+ time + "]";
	}

}
