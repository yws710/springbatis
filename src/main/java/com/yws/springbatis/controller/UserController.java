package com.yws.springbatis.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yws.springbatis.dao.UserDao;
import com.yws.springbatis.po.UserPo;

@Controller
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserDao userDao;

	@GetMapping("list")
	@ResponseBody
	public List<UserPo> list() throws Exception {
		List<UserPo> list = userDao.findAll();
		return list;
	}
	
	@GetMapping("find")
	@ResponseBody
	public UserPo getById(Integer id) throws Exception {
		return userDao.findById(id);
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
