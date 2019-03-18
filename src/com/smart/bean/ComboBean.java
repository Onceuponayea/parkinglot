package com.smart.bean;

/**
 * 包月产品实体
 * 
 * @author 86180
 *
 */
public class ComboBean {
	private Integer comboId;
	private String standard;// 收费标准
	private Integer price;// 价格

	public ComboBean() {
		super();
	}

	public ComboBean(Integer comboId, String standard, Integer price) {
		super();
		this.comboId = comboId;
		this.standard = standard;
		this.price = price;
	}

	public Integer getComboId() {
		return comboId;
	}

	public void setComboId(Integer comboId) {
		this.comboId = comboId;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ComboBean [comboId=" + comboId + ", standard=" + standard + ", price=" + price + "]";
	}

}
