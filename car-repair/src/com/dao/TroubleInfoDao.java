package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.TroubleInfo;

public interface TroubleInfoDao {
	public void addTroubleInfo(TroubleInfo ti);
	public List<TroubleInfo> troubleList();
	public void changStatus(@Param("id")String id,@Param("status")Integer status);
	public TroubleInfo findTrouble(String id);
}
