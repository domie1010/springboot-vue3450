package com.entity;

public class OrderInfo {
	private String id;
	private String user_id;
	private String user_name;
	private String plate;
	private String trouble_code;
	private String trouble_name;
	private String contact;
	private String contact_way;
	private String remark;
	private String creart_time;
	private Long long_time;
	private Integer status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContact_way() {
		return contact_way;
	}
	public void setContact_way(String contact_way) {
		this.contact_way = contact_way;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreart_time() {
		return creart_time;
	}
	public void setCreart_time(String creart_time) {
		this.creart_time = creart_time;
	}
	
	public Long getLong_time() {
		return long_time;
	}
	public void setLong_time(Long long_time) {
		this.long_time = long_time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", user_id=" + user_id + ", user_name=" + user_name + ", plate=" + plate
				+ ", trouble_code=" + trouble_code + ", contact=" + contact + ", contact_way=" + contact_way
				+ ", remark=" + remark + ", creart_time=" + creart_time + ", status=" + status + "]";
	}
	
	
}
