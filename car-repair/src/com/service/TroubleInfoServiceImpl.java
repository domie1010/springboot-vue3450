package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.TroubleInfoDao;
import com.entity.TroubleInfo;
import com.util.IDUtil;
import com.util.Result;
@Service
public class TroubleInfoServiceImpl implements TroubleInfoService{

	@Resource
	TroubleInfoDao dao;
	
	@Override
	public Result addTroubleInfo(String trouble_code, String trouble_name, String trouble_remark) {
		// TODO Auto-generated method stub
		
		Result nr=null;
		if(trouble_code.equals("")){
			nr=new Result("1", "请输入故障码", null);
		}else if(trouble_name.equals("")){
			nr=new Result("1", "请输入故障名称", null);
		}else{
			String id=IDUtil.createId();
			TroubleInfo ti=new TroubleInfo();
			ti.setId(id);
			ti.setTrouble_code(trouble_code);
			ti.setTrouble_name(trouble_name);
			ti.setTrouble_remark(trouble_remark);
			ti.setStatus(0);
			dao.addTroubleInfo(ti);
			nr=new Result("0", "故障信息添加成功", null);
		}		
		return nr;
	}

	@Override
	public Result troubleList() {
		// TODO Auto-generated method stub
		List<TroubleInfo> list=dao.troubleList();
		return new Result("0", "故障信息加载成功", list);
	}

	@Override
	public Result changStatus(String id) {
		// TODO Auto-generated method stub
		TroubleInfo ti=dao.findTrouble(id);
		Integer status=ti.getStatus();
		if(status==0){
			dao.changStatus(id, 1);
		}else{
			dao.changStatus(id, 0);
		}
		return new Result("0", "故障状态更改成功", null);
	}

}
