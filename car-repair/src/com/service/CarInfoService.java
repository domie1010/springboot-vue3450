package com.service;

import com.util.Result;

public interface CarInfoService {
	public Result addCarInfo(
			String user_id,
			String plate,
			String brand,
			String model,
			String color,
			String price,
			String date,
			String remark);
	
	public Result showCarInfo(String user_id);
	
	public Result showOneCar(String id);
	
	public Result showAllCar();
	
	public Result searchCar(String type,String keywords);
	
	public Result delCarInfo(String plate);
	
	public Result updateCarInfo(
			String id,
			String plate,
			String brand,
			String model,
			String color,
			String price,
			String date,
			String remark);
}
