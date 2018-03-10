package com.denny.jsptest.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.denny.jsptest.beans.Student;
import com.denny.jsptest.dbutil.Connections;

public class StudentDaoImpl implements StudentDao {
	private PreparedStatement ps ;
	private ResultSet rs ;
	@Override
	public boolean insert(Student stu) throws Exception{
		String sql = "insert into student(sname,loginname,loginpass) values (?,?,?)" ;
		ps = Connections.getConnection().prepareStatement(sql) ;
		ps.setString(1, stu.getSname());
		ps.setString(2, stu.getLoginName());
		ps.setString(3, stu.getLoginPass());
		return ps.executeUpdate() <= 0 ? false : true ;
	}

	@Override
	public Student selectById(Integer id) throws Exception{
		Student stu = null ;
		String sql = "select * from student where sid = ?" ;
		ps = Connections.getConnection().prepareStatement(sql) ;
		ps.setInt(1, id);
		rs = ps.executeQuery() ;
		if ( rs.next() ) {
			stu = new Student() ;
			stu.setSid(rs.getInt(1));
			stu.setSname(rs.getString(2));
			stu.setLoginName(rs.getString(3));
			stu.setLoginPass(rs.getString(4));
		}
		return stu ;
	}

	@Override
	public Student selectByLoginName(String loginName) throws Exception {
		Student stu = null ;
		String sql = "select * from student where loginName = ?" ;
		ps = Connections.getConnection().prepareStatement(sql) ;
		ps.setString(1, loginName);
		rs = ps.executeQuery() ;
		if ( rs.next() ) {
			stu = new Student() ;
			stu.setSid(rs.getInt(1));
			stu.setSname(rs.getString(2));
			stu.setLoginName(rs.getString(3));
			stu.setLoginPass(rs.getString(4));
		}
		return stu ;
	}

}
