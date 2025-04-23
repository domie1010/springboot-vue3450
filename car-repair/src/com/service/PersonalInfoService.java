package com.service;

import com.entity.PersonalInfo;
import com.util.Result;

public interface PersonalInfoService {
	public Result updatePersonalInfo(String user_id,String real_name,String sex,String birthday
			,String email,String address, String tel_num,String remark);
	
	public Result showPersonalInfo(String user_id);
}
