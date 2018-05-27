package com.yws.springbatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yws.springbatis.domain.User;

@Controller
@RequestMapping("test")
public class TestController {
	

	@GetMapping("hello")
	public String hello() throws Exception {
		return "hello";
	}

	@ResponseBody
	@GetMapping("userPo")
	public User user() throws Exception {
		User userPo = new User();
		userPo.setUsername("张三");
		return userPo;
	}
}
