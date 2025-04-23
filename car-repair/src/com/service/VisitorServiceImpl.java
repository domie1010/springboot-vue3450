package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.CarInfoDao;
import com.dao.VisitorDao;
import com.entity.Visitor;
import com.util.Result;
@Service
public class VisitorServiceImpl implements VisitorService{

	@Resource
	VisitorDao dao;
	
	@Override
	public Result visitorList() {
		// TODO Auto-generated method stub
		List<Visitor> list=dao.visitorList();
		return new Result("0", "访客信息加载成功", list);
	}

}
