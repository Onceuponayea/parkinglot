package com.smart.bean;

/**
 * 用户菜单实体
 * 
 * @author 86180
 *
 */
public class UserMenuBean {
	private Integer userMenuId;// 用户角色Id
	private UserBean userBean;// 用户实体
	private MeunBean menuBean;// 菜单实体

	public UserMenuBean() {
		super();
	}

	public UserMenuBean(Integer userMenuId, UserBean userBean, MeunBean menuBean) {
		super();
		this.userMenuId = userMenuId;
		this.userBean = userBean;
		this.menuBean = menuBean;
	}

	public Integer getUserMenuId() {
		return userMenuId;
	}

	public void setUserMenuId(Integer userMenuId) {
		this.userMenuId = userMenuId;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public MeunBean getMenuBean() {
		return menuBean;
	}

	public void setMenuBean(MeunBean menuBean) {
		this.menuBean = menuBean;
	}

	@Override
	public String toString() {
		return "UserMenuBean [userMenuId=" + userMenuId + ", userBean=" + userBean + ", menuBean=" + menuBean + "]";
	}

}
