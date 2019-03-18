package com.smart.bean;

/**
 * 车主实体
 * 
 * @author 86180
 *
 */
public class CustBean {
	private Integer custId;// 车主ID
	private String account;// 车主账号
	private String password;// 车主密码
	private String sexy;// 性别
	private Integer age;// 年龄
	private Integer phone;// 手机
	private Integer money;// 账户金额
	private String headPath;// 人脸识别路径

	public CustBean() {
		super();
	}

	public CustBean(Integer custId, String account, String password, String sexy, Integer age, Integer phone,
			Integer money, String headPath) {
		super();
		this.custId = custId;
		this.account = account;
		this.password = password;
		this.sexy = sexy;
		this.age = age;
		this.phone = phone;
		this.money = money;
		this.headPath = headPath;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSexy() {
		return sexy;
	}

	public void setSexy(String sexy) {
		this.sexy = sexy;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getHeadPath() {
		return headPath;
	}

	public void setHeadPath(String headPath) {
		this.headPath = headPath;
	}

	@Override
	public String toString() {
		return "CustBean [custId=" + custId + ", account=" + account + ", password=" + password + ", sexy=" + sexy
				+ ", age=" + age + ", phone=" + phone + ", money=" + money + ", headPath=" + headPath + "]";
	}

}
