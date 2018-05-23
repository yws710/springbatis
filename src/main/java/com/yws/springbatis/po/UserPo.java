package com.yws.springbatis.po;

import java.io.Serializable;

public class UserPo implements Serializable {

	private static final long serialVersionUID = 7547181835187867437L;
	
	private Integer id;
	private String username;
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "UserPo [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	
}
