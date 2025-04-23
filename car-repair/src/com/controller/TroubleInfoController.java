package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.CarInfoService;
import com.service.TroubleInfoService;
import com.util.Result;

@Controller
@RequestMapping("/troubleinfo")
public class TroubleInfoController {
	@Resource
	private TroubleInfoService ts;
		
	@RequestMapping("/add.do")
	@ResponseBody
	public Result addTroubleInfo(String trouble_code, String trouble_name, String trouble_remark) {
		System.out.println("进入TroubleInfoController/add.do");
		Result rs= ts.addTroubleInfo(trouble_code, trouble_name, trouble_remark);
		System.out.println(rs.toString());
		return rs;
	}
	
	
	@RequestMapping("/show.do")
	@ResponseBody
	public Result troubleList() {
		System.out.println("进入TroubleInfoController/show.do");
		Result rs=ts.troubleList();
		System.out.println(rs.toString());
		return rs;
	}

	@RequestMapping("/change.do")
	@ResponseBody
	public Result changStatus(String id) {
		System.out.println("进入TroubleInfoController/change.do");
		Result rs=ts.changStatus(id);
		System.out.println(rs.toString());
		return rs;
	}
}
