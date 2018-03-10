package com.denny.jsptest.service;

import com.denny.jsptest.beans.Student;
import com.denny.jsptest.dao.StudentDao;
import com.denny.jsptest.dao.StudentDaoImpl;

public class StudentService {
	private StudentDao dao = null ;

	public StudentService() {
		dao = new StudentDaoImpl() ;
	}
	
	public boolean addStudent(String ...datas) {
		boolean i = false ;
		try {
			i = this.dao.insert(new Student(0, datas[0], datas[1], datas[2]));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i ;
	}
	
	public Student findById(Integer id){
		Student stu = null ;
		try {
			stu = this.dao.selectById(id) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stu ;
	}
	public boolean loginning(String loginName,String loginPass){
		Student stu = null ;
		try {
			stu = this.dao.selectByLoginName(loginName) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stu.getLoginName().equals(loginName) && stu.getLoginPass().equals(loginPass) ;
	}

	public boolean checkUser(String...uName) {
		for ( int a = 0,len = uName.length; a < len; a++ ) {
			if (uName[a] == null) {
				return false ;
			} else if (!"".equals(uName[a].trim()) && a == len-1) {
				return true ;
			}
		}
		return false ;
	}
}
