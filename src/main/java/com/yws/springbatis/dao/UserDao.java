package com.yws.springbatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yws.springbatis.domain.User;

@Mapper // 在启动类上加@MapperScan注解，则这里不需要使用@Mapper注解
public interface UserDao {

	/**
	 * 查询所有
	 * @return
	 */
	List<User> findAll();
	
	/**
	 * 根据id查找
	 * @param id
	 * @return
	 */
	@Select("select * from sys_user where user_id = #{id}")
	User findById(@Param("id") Long id);
	
	/**
	 * 保存
	 * @param userPo
	 * @return
	 */
	@Insert("insert into t_user(user_name,email) values(#{username},#{email})")
	int insert(User user);
	
	/**
	 * 修改
	 * @param userPo
	 */
	@Update("update t_user set user_name = #{username},email = #{email} where id = #{id}")
	void update(User user);
	
	void updateById(User user);
	
	/**
	 * 根据id删除
	 * @param id
	 */
	@Delete("delete from t_user where id = #{id}")
	void delete(Integer id);
}
