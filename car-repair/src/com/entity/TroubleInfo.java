package com.entity;

public class TroubleInfo {
	private String id;
	private String trouble_code;
	private String trouble_name;
	private String trouble_remark;
	private Integer status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTrouble_code() {
		return trouble_code;
	}
	public void setTrouble_code(String trouble_code) {
		this.trouble_code = trouble_code;
	}
	public String getTrouble_name() {
		return trouble_name;
	}
	public void setTrouble_name(String trouble_name) {
		this.trouble_name = trouble_name;
	}
	public String getTrouble_remark() {
		return trouble_remark;
	}
	public void setTrouble_remark(String trouble_remark) {
		this.trouble_remark = trouble_remark;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TroubleInfo [id=" + id + ", trouble_code=" + trouble_code + ", trouble_name=" + trouble_name
				+ ", trouble_remark=" + trouble_remark + ", status=" + status + "]";
	}
	
}
