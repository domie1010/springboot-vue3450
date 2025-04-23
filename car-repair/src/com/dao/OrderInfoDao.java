package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.entity.OrderInfo;

public interface OrderInfoDao {
	public void addOrderInfo(OrderInfo oi);
	public List<OrderInfo> findAllOrder();
	public void delOrderInfo(String id);
	public void changStatus(@Param("id")String id,@Param("status")Integer status);
	public List<OrderInfo> findOrder(String user_id);
	public List<OrderInfo> searchOrderInfo(Map<String,Object> params);
	public List<OrderInfo> findByStatus(Integer status);
	public List<OrderInfo> findBySort();
}
