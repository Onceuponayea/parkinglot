package com.smart.bean;

/**
 * 收费表实体
 * 
 * @author 86180
 *
 */
public class ReceiptBean {
	private Integer receiptId;// 收费Id
	private UserBean userBean;// 用户实体
	private CarBean carBean;// 汽车实体
	private Integer money;// 金额
	private String time;// 停车时间

	public ReceiptBean() {
		super();
	}

	public ReceiptBean(Integer receiptId, UserBean userBean, CarBean carBean, Integer money, String time) {
		super();
		this.receiptId = receiptId;
		this.userBean = userBean;
		this.carBean = carBean;
		this.money = money;
		this.time = time;
	}

	public Integer getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public CarBean getCarBean() {
		return carBean;
	}

	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ReceiptBean [receiptId=" + receiptId + ", userBean=" + userBean + ", carBean=" + carBean + ", money="
				+ money + ", time=" + time + "]";
	}

}
