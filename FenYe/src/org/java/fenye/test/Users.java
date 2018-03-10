package org.java.fenye.test;

import java.io.Serializable;

public class Users implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer userid;
	private String username ;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
