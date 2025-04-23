package com.service;

import org.apache.ibatis.annotations.Param;

import com.util.Result;

public interface TroubleInfoService {
	public Result addTroubleInfo( String trouble_code,
			String trouble_name,String trouble_remark);
	
	public Result troubleList();
	
	public Result changStatus(String id);
}
