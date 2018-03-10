package com.denny.jsptest.dao;

import com.denny.jsptest.beans.Student;

public interface StudentDao {
	public boolean insert(Student stu) throws Exception ;
	public Student selectById(Integer id) throws Exception;
	public Student selectByLoginName(String loginName) throws Exception;
}
