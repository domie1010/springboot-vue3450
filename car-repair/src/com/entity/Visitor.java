package com.entity;

public class Visitor {
	private String id;
	private String v_name;
	private String v_time;
	private Long long_time;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	public String getV_time() {
		return v_time;
	}
	public void setV_time(String v_time) {
		this.v_time = v_time;
	}
	public Long getLong_time() {
		return long_time;
	}
	public void setLong_time(Long long_time) {
		this.long_time = long_time;
	}
	@Override
	public String toString() {
		return "Visitor [id=" + id + ", v_name=" + v_name + ", v_time=" + v_time + ", long_time=" + long_time + "]";
	}
	
}
