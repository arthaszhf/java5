package com.java5.arthas.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {

	@RequestMapping("/hello")
	public String hello(){
		System.out.println("hello");
		return "index";
	}
	
}
