package com.yws.springbatis.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yws.springbatis.dao.UserDao;
import com.yws.springbatis.domain.User;

@Controller
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping
	public String users() throws Exception {
		return "user/list";
	}

	@GetMapping("list")
	@ResponseBody
	public List<User> list() throws Exception {
		List<User> list = userDao.findAll();
		return list;
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public User edit(@RequestBody User user) throws Exception {
		userDao.updateById(user);
		return userDao.findById(user.getUserId());
	}
	
	@RequestMapping("add")
	@ResponseBody
	public User add(@RequestBody User user) throws Exception {
		user.setUserId(3L);
		return user;
	}

	
	@GetMapping("date")
	@ResponseBody
	public Map<String,Object> date() throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "张三");
		map.put("birthday", new Date());
		return map;
	}
}
