package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.OrderInfoService;
import com.service.VisitorService;
import com.util.Result;
@Controller
@RequestMapping("/visitor")
public class VisitorController {
	@Resource
	private VisitorService vs;
	
	@RequestMapping("/show.do")
	@ResponseBody
	public Result visitorList() {
		System.out.println("Ω¯»ÎVisitorController/show.do");
		Result rs=vs.visitorList();
		System.out.println(rs);
		return rs;	
	}
}
