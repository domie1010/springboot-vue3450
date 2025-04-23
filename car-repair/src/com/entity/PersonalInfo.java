package com.entity;

public class PersonalInfo {
	private String user_id;
	private String real_name;
	private String sex;
	private String birthday;
	private String email;
	private String address;
	private String tel_num;
	private String remark;

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel_num() {
		return tel_num;
	}
	public void setTel_num(String tel_num) {
		this.tel_num = tel_num;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "PersonalInfo [user_id=" + user_id + ", real_name=" + real_name + ", sex=" + sex + ", birthday="
				+ birthday + ", email=" + email + ", address=" + address + ", tel_num=" + tel_num + ", remark=" + remark
				+ "]";
	}
	
}
