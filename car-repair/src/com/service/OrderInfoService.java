package com.service;

import java.util.List;

import com.entity.OrderInfo;
import com.util.Result;

public interface OrderInfoService {
	public Result addOrderInfo(String user_id,String user_name,
			String plate,String trouble_code,String trouble_name,
			String contact,String contact_way,
			String remark);
	
	public Result findAllOrder();
	
	public Result delOrderInfo(String id);
	
	public Result changStatus(String id);
	
	public Result findOrder(String user_id);
	
	public Result searchOrderInfo(String type,String keywords);
	
	public Result findDealOrder();
	public Result findUndealOrder();
	
	public Result findBySort();
}
