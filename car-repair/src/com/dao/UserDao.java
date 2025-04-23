package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.User;

public interface UserDao {
	public User userLogin(String name);
	public User findUser(String id);
	public void changPwd(@Param("id")String id,@Param("password")String password);
	public List<User> userList();
	public void addUser(User user);
	public void changStatus(@Param("id")String id,@Param("status")Integer status);
}
