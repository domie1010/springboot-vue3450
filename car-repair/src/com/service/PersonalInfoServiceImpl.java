package com.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.PersonalInfoDao;
import com.entity.PersonalInfo;
import com.util.Result;

@Service
public class PersonalInfoServiceImpl implements PersonalInfoService {

	@Resource
	PersonalInfoDao dao;
	
	@Override
	public Result updatePersonalInfo(String user_id,String real_name, String sex, String birthday, String email, String address,
			String tel_num, String remark) {
		// TODO Auto-generated method stub
		PersonalInfo pi=new PersonalInfo();
		pi.setUser_id(user_id);
		pi.setReal_name(real_name);
		pi.setSex(sex);
		pi.setBirthday(birthday);
		pi.setEmail(email);
		pi.setTel_num(tel_num);
		pi.setReal_name(real_name);
		pi.setAddress(address);
		pi.setRemark(remark);
		dao.updatePersonalInfo(pi);
		return new Result("0", "个人信息修改成功", null);
		
	}

	@Override
	public Result showPersonalInfo(String user_id) {
		// TODO Auto-generated method stub
		PersonalInfo pi=dao.showPersonalInfo(user_id);
		return new Result("0", "个人信息加载成功", pi);
	}

}
