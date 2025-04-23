package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.PersonalInfoService;
import com.service.UserService;
import com.util.Result;

@Controller
@RequestMapping("/personalinfo")
public class PersonalInfoController {
	@Resource
	private PersonalInfoService ps;
	
	@RequestMapping("/update.do")
	@ResponseBody
	public Result execute(String user_id,String real_name,String sex,String birthday,
			String email,String address,String tel_num,String remark){
		System.out.println("进入controller");
		Result rs=ps.updatePersonalInfo(user_id, real_name, sex, birthday, email, address, tel_num, remark);
		System.out.println(rs.toString());
		return rs;
	}
	
	@RequestMapping("/show.do")
	@ResponseBody
	public Result execute(String user_id){
		System.out.println("进入controller");
		Result rs=ps.showPersonalInfo(user_id);
		System.out.println(rs.toString());
		return rs;
	}
}
