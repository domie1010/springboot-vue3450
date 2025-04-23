package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.CarInfoDao;
import com.entity.CarInfo;
import com.service.CarInfoService;
import com.service.PersonalInfoService;
import com.util.Result;

@Controller
@RequestMapping("/carinfo")
public class CarInfoController {
	@Resource
	private CarInfoService cs;
	
	@RequestMapping("/add.do")
	@ResponseBody
	public Result execute(String user_id,
			String plate,
			String brand,
			String model,
			String color,
			String price,
			String date,
			String remark){
		System.out.println("进入controller");
		Result rs=cs.addCarInfo(user_id, plate, brand, model, color, price, date, remark);
		System.out.println(rs.toString());
		return rs;
	}
	
	
	@RequestMapping("/show.do")
	@ResponseBody
	public Result show(String user_id){
		System.out.println("user_id="+user_id);
		Result rs=cs.showCarInfo(user_id);
		System.out.println(rs.toString());
		return rs;
	}
	
	@RequestMapping("/showone.do")
	@ResponseBody
	public Result showOneCar(String id){
		System.out.println("进入controller");
		Result rs=cs.showOneCar(id);
		System.out.println(rs.toString());
		return rs;
	}
	
	@RequestMapping("/showAll.do")
	@ResponseBody
	public Result showAllCar() {
		Result rs=cs.showAllCar();
		System.out.println(rs.toString());
		return rs;
	}
	
	@RequestMapping("/search.do")
	@ResponseBody
	public Result searchCar(String type,String keywords){
		System.out.println("进入controller/search.do");
		Result rs=cs.searchCar(type, keywords);
		return rs;
	}
	
	@RequestMapping("/delete.do")
	@ResponseBody
	public Result delete(String id){
		System.out.println("进入controller");
		Result rs=cs.delCarInfo(id);
		System.out.println(rs.toString());
		return rs;
	}
	
	@RequestMapping("/update.do")
	@ResponseBody
	public Result update(String id, String plate, String brand, String model, String color, String price,
			String date, String remark) {
		System.out.println("进入controller");
		Result rs=cs.updateCarInfo(id, plate, brand, model, color, price, date, remark);
		System.out.println(rs.toString());
		return rs;
	}
}
