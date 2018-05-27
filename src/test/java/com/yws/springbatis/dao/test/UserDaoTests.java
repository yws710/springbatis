package com.yws.springbatis.dao.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.yws.springbatis.dao.UserDao;

/**
 * 单元测试中使用@Transactional注解，测试之后数据会回滚。
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTests {

	@Autowired
	private UserDao userDao;
	
//	@Test
//	public void testFindAll() {
//		List<UserPo> list = userDao.findAll();
//		System.out.println(list.toString());
//	}
//	
//	@Test
//	public void testFindById() {
//		UserPo userPo = userDao.findById(1);
//		System.out.println(userPo.toString());
//	}
//
//	@Test
//	@Transactional
//	public void testInsert() {
//		UserPo userPo = new UserPo();
//		userPo.setUsername("王五");
//		userPo.setEmail("wangwu@163.com");
//		int i = userDao.insert(userPo);
//		System.out.println(i);
//		System.out.println(userDao.findAll().toString());
//	}
//	
//	@Test
//	@Transactional
//	public void testUpdate() {
//		UserPo userPo = new UserPo();
//		userPo.setId(1);
//		userPo.setUsername("王五");
//		userPo.setEmail("wangwu@163.com");
//		userDao.update(userPo);
//		System.out.println(userDao.findById(1));
//	}
//	
//	@Test
//	@Transactional
//	public void testDelete() {
//		userDao.delete(1);
//		UserPo userPo = userDao.findById(1);
//		Assert.assertEquals(null, userPo);
//	}
}
