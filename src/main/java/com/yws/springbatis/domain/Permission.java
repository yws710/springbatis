package com.yws.springbatis.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 权限实体类，与角色属于多对多关系。
 * @author yws710
 *
 */
public class Permission implements Serializable {

	private static final long serialVersionUID = -2085847273575039824L;
	private Integer id; // 主键id
	private String name; // 资源名称
	private String description; // 描述
	private List<Role> roles = new ArrayList<Role>(); // 该资源被哪些角色拥有

	// ------------------------ getter & setter --------------------------------------
	
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

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
