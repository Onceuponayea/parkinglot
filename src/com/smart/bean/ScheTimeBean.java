package com.smart.bean;

/**
 * 排班时间段实体
 * 
 * @author 86180
 *
 */
public class ScheTimeBean {
	private Integer scheTimeId;// 时间段ID
	private String name;// 名称
	private String startTime;// 开始时间
	private String endTime;// 结束时间

	public ScheTimeBean() {
		super();
	}

	public ScheTimeBean(Integer scheTimeId, String name, String startTime, String endTime) {
		super();
		this.scheTimeId = scheTimeId;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Integer getScheTimeId() {
		return scheTimeId;
	}

	public void setScheTimeId(Integer scheTimeId) {
		this.scheTimeId = scheTimeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "ScheTime [scheTimeId=" + scheTimeId + ", name=" + name + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}

}
