package org.java.fenye.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Connection{
	private static java.sql.Connection conn = null ;
	private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=eownen" ;
	private static final String USER = "sa" ;
	private static final String PASSWORD = "manager" ;
	private static final String TABLE_NAME = "users" ;
	public static Integer PAGESIZE = 10 ; // 每页显示的行数(运行时不可修改)
	public static Integer ROWCOUNT = 0 ;	// 数据表总共多少行记录
	public static Integer PAGECOUNT = 0 ;	// 可显示多少页
	public static Integer PAGE_NOW = 1 ; // 当前显示的第几行(运行时可修改)
	public static List<Users> DATASET = null ;// 数据集
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver") ; // 利用反射加载sqlserver数据库连接类(驱动)
			conn = conn == null 
					? getConnection() : conn.isClosed()
					? getConnection() : conn;
			ROWCOUNT = ROWCOUNT == 0 ? Paging.getRowCount(TABLE_NAME) : ROWCOUNT;
			PAGECOUNT = PAGECOUNT == 0 ? Paging._getPageCount(PAGESIZE) : PAGECOUNT;
			DATASET = getPagingResult(PAGE_NOW) ; // 数据集
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static java.sql.Connection getConnection() throws Exception {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	public static List<Users> getPagingResult(Integer pageNow){
		List<Users> userList = null ;
		try {
			userList = Paging.getData(PAGESIZE, pageNow);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("查询成功!");
		System.err.println("总共有:" + ROWCOUNT + "条记录.");
		System.err.println("可分:" + PAGECOUNT + "页显示.");
		System.err.println("当前是第:" + PAGE_NOW + "页.");
		System.err.println("编号\t\t姓名");
		for(Users u : userList) {
			System.err.print(u.getUserid() + "\t\t");
			System.err.println(u.getUsername());
		}
		return userList ;
	}
	static class Paging {
		/***
		 * @param pageSize 一页显示多少条记录
		 * @param pageNow 当前第几页
		 * @return 数据集
		 * @throws SQLException
		 */
		private static List<Users> getData(Integer pageSize,Integer pageNow) throws Exception {
			Statement t = Connection.conn.createStatement() ;
			List<Users> userList= new ArrayList<Users>() ;
			// 查询数据库eownen的myusers表倒数三条记录
			String sql = "select top " + pageSize + " * from users where userid not in ( "
					+ "select top " + pageSize * (pageNow-1) + " userid from users )" ;
			ResultSet rs = t.executeQuery(sql) ;
			while(rs.next()) {
				Users user = new Users();
				user.setUserid(rs.getInt(1)) ;
				user.setUsername(rs.getString(2)) ;
				userList.add(user);
			}
			return userList ;
		}
		/**
		 * @param pageSize 指定每页显示的行记录数
		 * @return 总共的页数
		 * @throws SQLException 异常抛出
		 */
		private static int _getPageCount(Integer pageSize) throws SQLException {
			int count = getRowCount("users") ;
			return count % pageSize == 0 ? count / pageSize : count / pageSize + 1 ;
		}
		/***
		 * @return 返回数据表的总行记录
		 * @throws SQLException 异常抛出
		 */
		private static final int getRowCount(String tableName) throws SQLException {
			ResultSet rs = Connection.conn.createStatement().executeQuery("select count(*) from " + tableName);
			return rs.next() ? rs.getInt(1) : 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(DATASET.size());
	}
}
