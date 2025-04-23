package com.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.OrderInfoDao;
import com.entity.OrderInfo;
import com.entity.TroubleInfo;
import com.util.IDUtil;
import com.util.Result;
@Service
public class OrderInfoServiceImpl implements OrderInfoService{

	@Resource
	OrderInfoDao dao;
	
	@Override
	public Result addOrderInfo(String user_id, String user_name, String plate, String trouble_code,String trouble_name, String contact,
			String contact_way, String remark) {
		// TODO Auto-generated method stub
		OrderInfo oi=new OrderInfo();
		String id=IDUtil.createId();
		oi.setId(id);
		oi.setUser_id(user_id);
		oi.setUser_name(user_name);
		oi.setPlate(plate);
		oi.setTrouble_code(trouble_code);
		oi.setTrouble_name(trouble_name);
		oi.setContact(contact);
		oi.setContact_way(contact_way);
		oi.setRemark(remark);
		oi.setCreart_time(getTime());
		oi.setLong_time(System.currentTimeMillis());
		oi.setStatus(0);
		dao.addOrderInfo(oi);
		return new Result("0", "订单信息添加成功", null);
	}

	private static String getTime(){
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");       
		Date curDate=new Date(System.currentTimeMillis());//获取当前时间       
		String str=formatter.format(curDate); 
		return str;
	}


	@Override
	public Result findAllOrder() {
		// TODO Auto-generated method stub
		List<OrderInfo> list=dao.findAllOrder();
		return new Result("0", "订单信息加载成功", list);
	}

	@Override
	public Result delOrderInfo(String id) {
		// TODO Auto-generated method stub
		dao.delOrderInfo(id);
		return new Result("0", "订单信息删除成功", null);
	}

	@Override
	public Result changStatus(String id) {
		// TODO Auto-generated method stub
		dao.changStatus(id, 1);
		return new Result("0", "订单状态更改成功", null);
	}

	@Override
	public Result findOrder(String user_id) {
		// TODO Auto-generated method stub
		List<OrderInfo> list=dao.findOrder(user_id);
		return new Result("0", "订单信息加载成功", list);
	}

	@Override
	public Result searchOrderInfo(String type, String keywords) {
		// TODO Auto-generated method stub
		Map<String,Object> params=new HashMap<String,Object>();
		if(!type.equals("") && keywords.equals("")){
			return new Result("1", "请输入关键字", null);
		}else if(type.equals("") && !keywords.equals("")){
			return new Result("1", "请选择分类", null);
		}else if(type.equals("1")){
			params.put("plate", "%"+keywords+"%");
		}else if(type.equals("2")){
			params.put("trouble_name", "%"+keywords+"%");
		}else if(type.equals("3")){
			params.put("user_name", "%"+keywords+"%");
		}else if(type.equals("4")){
			params.put("contact", "%"+keywords+"%");
		}
		List<OrderInfo> list=dao.searchOrderInfo(params);
		return new Result("0", "订单信息加载成功", list);
	}

	@Override
	public Result findDealOrder() {
		// TODO Auto-generated method stub
		List<OrderInfo> list=dao.findByStatus(1);
		return new Result("0", "订单信息加载成功", list);
	}

	@Override
	public Result  findUndealOrder() {
		// TODO Auto-generated method stub
		List<OrderInfo> list=dao.findByStatus(0);
		return new Result("0", "订单信息加载成功", list);
	}

	@Override
	public Result findBySort() {
		// TODO Auto-generated method stub
		List<OrderInfo> list=dao.findBySort();
		return new Result("0", "订单信息加载成功", list);
	}
	
}
