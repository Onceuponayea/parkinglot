package com.smart.bean;

/**
 * 菜单实体
 * 
 * @author 86180
 *
 */
public class MenuBean {
	private Integer menuId;// 菜单Id
	private Integer PId;// 上级菜单
	private String menuName;// 菜单名字
	private String url;// 路径

	public MenuBean() {
		super();
	}

	public MenuBean(Integer menuId, Integer pId, String menuName, String url) {
		super();
		this.menuId = menuId;
		PId = pId;
		this.menuName = menuName;
		this.url = url;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getPId() {
		return PId;
	}

	public void setPId(Integer pId) {
		PId = pId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "MeunBean [menuId=" + menuId + ", PId=" + PId + ", menuName=" + menuName + ", url=" + url + "]";
	}

}
