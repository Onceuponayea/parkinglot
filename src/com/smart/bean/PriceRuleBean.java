package com.smart.bean;

/**
 * 计费规则表
 * 
 * @author 86180
 *
 */
public class PriceRuleBean {
	private Integer ruleId;// 规则Id
	private String startTime;// 开始时间
	private String endTime;// 结束时间
	private Integer firMoney;// 初始金额
	private Integer addMoner;// 增长金额

	public PriceRuleBean(Integer ruleId, String startTime, String endTime, Integer firMoney, Integer addMoner) {
		super();
		this.ruleId = ruleId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.firMoney = firMoney;
		this.addMoner = addMoner;
	}

	public PriceRuleBean() {
		super();
	}

	public Integer getRuleId() {
		return ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
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

	public Integer getFirMoney() {
		return firMoney;
	}

	public void setFirMoney(Integer firMoney) {
		this.firMoney = firMoney;
	}

	public Integer getAddMoner() {
		return addMoner;
	}

	public void setAddMoner(Integer addMoner) {
		this.addMoner = addMoner;
	}

	@Override
	public String toString() {
		return "PriceRule [ruleId=" + ruleId + ", startTime=" + startTime + ", endTime=" + endTime + ", firMoney="
				+ firMoney + ", addMoner=" + addMoner + "]";
	}

}
