package com.service;

import com.util.Result;

public interface UserService {
	public Result login(String userName,String userPwd);
	
	public Result changePwd(String user_id, String mpass, String newpass);
	
	public Result userList();
	
	public Result addUser(String name,String password,Integer type);
	
	public Result changeStatus(String id);
}
