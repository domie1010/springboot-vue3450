package com.dao;

import org.apache.ibatis.annotations.Param;

import com.entity.PersonalInfo;

public interface PersonalInfoDao {
	public void updatePersonalInfo(PersonalInfo pi);
	
	public PersonalInfo showPersonalInfo(@Param("user_id")String user_id);
	
	public void addUserId(String user_id);
}
