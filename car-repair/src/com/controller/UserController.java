package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;
import com.service.UserService;
import com.util.Result;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService us;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public Result execute(String name,String password){
		Result rs=us.login(name, password);
		System.out.println(name);
		System.out.println(rs.toString());
		return rs;
	}
	@RequestMapping("/changepwd.do")
	@ResponseBody
	public Result changePwd(String user_id, String mpass, String newpass) {
		Result rs=us.changePwd(user_id, mpass, newpass);
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/show.do")
	@ResponseBody
	public Result userList() {
		Result rs=us.userList();
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/add.do")
	@ResponseBody
	public Result addUser(String name, String password, Integer type){
		Result rs=us.addUser(name, password, type);
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/change.do")
	@ResponseBody
	public Result changeStatus(String id){
		Result rs=us.changeStatus(id);
		System.out.println(rs);
		return rs;
	}
}
