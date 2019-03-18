package com.smart.bean;

/**
 * 参数表
 * 
 * @author 86180
 *
 */
public class ParamBean {
	private Integer paramId;// 参数ID
	private String paramName;// 参数名称
	private String paramData;// 参数内容

	public ParamBean() {
		super();
	}

	public ParamBean(Integer paramId, String paramName, String paramData) {
		super();
		this.paramId = paramId;
		this.paramName = paramName;
		this.paramData = paramData;
	}

	public Integer getParamId() {
		return paramId;
	}

	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamData() {
		return paramData;
	}

	public void setParamData(String paramData) {
		this.paramData = paramData;
	}

	@Override
	public String toString() {
		return "ParamBean [paramId=" + paramId + ", paramName=" + paramName + ", paramData=" + paramData + "]";
	}

}
