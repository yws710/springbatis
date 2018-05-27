package com.yws.springbatis.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * 角色实体类，与用户属于多对多关系，与资源实体类属于多对多关系。
 * @author yws710
 *
 */
public class Role implements Serializable {

	private static final long serialVersionUID = -8431112017717947896L;
	private Integer id; // 编号
	private String name; // 角色名称
	private String description; // 描述
	private List<User> users = new ArrayList<User>();// 拥有该角色的用户列表
	private List<Permission> permissions = new ArrayList<Permission>(); // 该角色具有哪些资源
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
}
