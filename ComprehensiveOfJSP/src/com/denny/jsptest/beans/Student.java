package com.denny.jsptest.beans;

import java.io.Serializable;
/***
 * @author Ewonen-PC
 *
 */
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer sid ;
	private String sname ;
	private String loginName ;
	private String loginPass ;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPass() {
		return loginPass;
	}
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	public Student(Integer sid, String sname, String loginName, String loginPass) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.loginName = loginName;
		this.loginPass = loginPass;
	}
	public Student() {
		super();
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
}
