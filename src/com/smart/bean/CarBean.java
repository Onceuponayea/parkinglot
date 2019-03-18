package com.smart.bean;

/**
 * 车辆信息表
 * 
 * @author 86180
 *
 */
public class CarBean {
	private Integer carId;// 汽车ID
	private String carNum;// 车牌号码
	private String carImg;// 汽车图片
	private CustBean custBean;// 车主实体

	public CarBean() {
		super();
	}

	public CarBean(Integer carId, String carNum, String carImg, CustBean custBean) {
		super();
		this.carId = carId;
		this.carNum = carNum;
		this.carImg = carImg;
		this.custBean = custBean;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getCarImg() {
		return carImg;
	}

	public void setCarImg(String carImg) {
		this.carImg = carImg;
	}

	public CustBean getCustBean() {
		return custBean;
	}

	public void setCustBean(CustBean custBean) {
		this.custBean = custBean;
	}

	@Override
	public String toString() {
		return "CarBean [carId=" + carId + ", carNum=" + carNum + ", carImg=" + carImg + ", custBean=" + custBean + "]";
	}

}
