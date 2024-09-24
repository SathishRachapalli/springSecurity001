package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controllers {
	
	
	@GetMapping("/hi")
	@ResponseBody
	public String sayHi()
	{
		return "hi";
	}
	
	
	@GetMapping("/bye")
	@ResponseBody
	public String sayBye()
	{
		return "bye";
	}
	
	
	@GetMapping("/hello")
	public String sayingHello()
	{
		return "hello";
	}
	
	

}
