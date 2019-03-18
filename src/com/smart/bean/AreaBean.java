package com.smart.bean;

/**
 * 区域实体
 * 
 * @author 86180
 *
 */
public class AreaBean {
	private Integer areaId;// 区域ID
	private String areaName;// 区域名称

	public AreaBean() {
		super();
	}

	public AreaBean(Integer areaId, String areaName) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "Area [areaId=" + areaId + ", areaName=" + areaName + "]";
	}

}
