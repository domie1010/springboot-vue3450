package com.dao;

import java.util.List;

import com.entity.PartsInfo;

public interface PartsInfoDao {
	public void buyParts(String id);
	public void useParts(String id);
	
	public List<PartsInfo> findAllParts();
}
