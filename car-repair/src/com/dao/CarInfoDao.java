package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.entity.CarInfo;

public interface CarInfoDao {
	public void addCarInfo(CarInfo ci);
	
	public List<CarInfo> showCarInfo(@Param("user_id")String user_id);
	
	public List<CarInfo> showAllCar();
	
	public CarInfo showOneCar(@Param("id")String id);
	
	public void delCarInfo(@Param("id")String id);
	
	public void updateCarInfo(CarInfo ci);
	
	public List<CarInfo> searchCarInfo(Map<String,Object> params);
	
}
