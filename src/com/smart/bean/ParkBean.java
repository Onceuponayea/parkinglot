package com.smart.bean;

/**
 * 车位实体
 * 
 * @author 86180
 *
 */
public class ParkBean {
	private Integer parkId;// 车位ID
	private CarBean carBean;// 汽车实体
	private String parkArea;// 停车区域
	private Integer parkNum;// 车位序号
	private String parkState;// 车位状态
	private String mapPath;// 地图路径
	private String imagePath;// 图片路径

	public ParkBean() {
		super();
	}

	public ParkBean(Integer parkId, CarBean carBean, String parkArea, Integer parkNum, String parkState, String mapPath,
			String imagePath) {
		super();
		this.parkId = parkId;
		this.carBean = carBean;
		this.parkArea = parkArea;
		this.parkNum = parkNum;
		this.parkState = parkState;
		this.mapPath = mapPath;
		this.imagePath = imagePath;
	}

	public Integer getParkId() {
		return parkId;
	}

	public void setParkId(Integer parkId) {
		this.parkId = parkId;
	}

	public CarBean getCarBean() {
		return carBean;
	}

	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}

	public String getParkArea() {
		return parkArea;
	}

	public void setParkArea(String parkArea) {
		this.parkArea = parkArea;
	}

	public Integer getParkNum() {
		return parkNum;
	}

	public void setParkNum(Integer parkNum) {
		this.parkNum = parkNum;
	}

	public String getParkState() {
		return parkState;
	}

	public void setParkState(String parkState) {
		this.parkState = parkState;
	}

	public String getMapPath() {
		return mapPath;
	}

	public void setMapPath(String mapPath) {
		this.mapPath = mapPath;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "ParkBean [parkId=" + parkId + ", carBean=" + carBean + ", parkArea=" + parkArea + ", parkNum=" + parkNum
				+ ", parkState=" + parkState + ", mapPath=" + mapPath + ", imagePath=" + imagePath + "]";
	}

}
