package com.arthas.czmsy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkipController {

	@RequestMapping("index")
	public String index(){
		return "index";
	}
	@RequestMapping("teacherInfo")
	public String teacherInfo(){
		return "teacherInfo";
	}
	
}
