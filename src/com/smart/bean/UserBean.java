package com.smart.bean;

/**
 * 用户实体
 * 
 * @author 86180
 *
 */
public class UserBean {
	private Integer userID;// 用户Id
	private String userName;// 用户名
	private String password;// 密码
	private String sexy;// 性别
	private String realName;// 真实姓名
	private Integer phone;// 手机
	private RoleBean roleBean;// 角色实体

	public UserBean() {
		super();
	}

	public UserBean(Integer userID, String userName, String password, String sexy, String realName, Integer phone,
			RoleBean roleBean) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.sexy = sexy;
		this.realName = realName;
		this.phone = phone;
		this.roleBean = roleBean;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public RoleBean getRoleBean() {
		return roleBean;
	}

	public void setRoleBean(RoleBean roleBean) {
		this.roleBean = roleBean;
	}

	@Override
	public String toString() {
		return "UserBean [userID=" + userID + ", userName=" + userName + ", password=" + password + ", sexy=" + sexy
				+ ", realName=" + realName + ", phone=" + phone + ", roleBean=" + roleBean + "]";
	}

}
