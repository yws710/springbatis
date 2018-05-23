package com.yws.springbatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
	

	@GetMapping("hello")
	@ResponseBody
	public String hello() throws Exception {
		return "Hello World!";
	}

}
