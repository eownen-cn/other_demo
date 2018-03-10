package org.java.referenc;
/**
 * 数据表映射
 * 1、一对多
 * 2、多对一
 * 测试要点:先设置好各自的独立属性，在考虑关系(引用)问题
 * 难点:包含关系的处理，一定要弄清楚先有什么，再有什么，一步一步往下走
 * @author Ewonen-PC
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		// 第一步：产生各自独立对象
		Dept dept = new Dept(10, "ACCOUNTING", "New York") ;
		Emp ea = new Emp(7369,"SMITH","CLERK",800.0) ; // 斯密斯
		Emp eb = new Emp(7902,"FORD","MANAGER",2450.0) ; // 福德
		Emp ec = new Emp(7369,"KING","PRESIDENT",5000.0) ; // 肯
		
		// 第二部：设置雇员和领导关系
		ea.setMgr(eb);
		eb.setMgr(ec);
		
		// 第三部：设置雇员和部门关系
		ea.setDept(dept);
		eb.setDept(dept);
		ec.setDept(dept);
		
		// 测试雇员信息是否完善
		System.out.println(ea.getInfo());
		System.out.println(eb.getInfo());
		System.out.println(ec.getInfo());
		
		// 测试部门信息是否完善
		System.out.println(dept.getInfo());
		
		// 通过雇员找到其所在部门
		System.out.println("通过雇员找部门 ==> " + ea.getDept().getInfo());
		System.out.println("通过雇员找到其上级所在的部门信息 ==> " + ea.getMgr().getDept().getInfo());
		System.out.println("通过雇员找到其上级的上级的信息 ==> " + ea.getMgr().getMgr().getInfo());
		System.out.println("通过雇员找到其上级的上级所在的部门信息 ==> " + ea.getMgr().getMgr().getDept().getInfo());
		
		// 上面是多对一 
		// 下面设置一对多
		
		// 第一步，为部门添加雇员信息
		dept.setEmps(new Emp[]{ea,eb,ec});
		
		// 第二部，根据部门取出该部门所有雇员信息
		Emp[] emps= dept.getEmps() ; // 获取该部门（dept）下的所有雇员
		System.out.println("\n-----------------------------华丽的分割线-----------------------------\n");
		for (int a = 0 ; a < emps.length ; a ++) { // 输出雇员信息
			System.out.println(emps[a].getInfo());
			if (emps[a].getMgr() != null) {
				System.out.println("领导信息：" + emps[a].getMgr().getInfo());
			} else {
				System.out.println("领导信息：" + null);
			}
			System.out.println();
		}
 	}
}
/**
 * 雇员类
 * @author Ewonen-PC
 *
 */
class Emp{
	private int empno ; // 雇员编号
	private String ename ; // 姓名
	private String job ; // 工作岗位
	private double sal ; // 工资
	private Emp mgr ; // 雇员的上级领导
	private Dept dept ; // 雇员所在的部门
	public Emp(int empno,String ename,String job,double sal) {
		this.empno = empno ;
		this.ename = ename ;
		this.job = job ;
		this.sal = sal ;
	}
	public void setMgr(Emp mgr) {
		this.mgr = mgr ;
	}
	public Emp getMgr() {
		return this.mgr ;
	}
	public void setDept(Dept dept){
		this.dept = dept ;
	}
	public Dept getDept(){
		return this.dept ;
	}
	public String getInfo() {
		return "雇员编号:" + this.empno + " | 姓名:" + this.ename + " | 岗位:" + this.job + " | 工资:" + this.sal ;
	}
}
/**
 * 雇员的部门表
 * @author Ewonen-PC
 *
 */
class Dept{
	private int deptno ;
	private String dname ;
	private String loc ;
	private Emp emps[] = null ;
	public Dept(int deptno , String dname,String loc){
		this.deptno = deptno ;
		this.dname = dname ;
		this.loc = loc ;
	}
	public void setEmps(Emp emps[]) {
		this.emps = emps ;
	}
	public Emp[] getEmps() {
		return this.emps ;
	}
	public String getInfo() {
		return "部门编号:" + this.deptno + " | 部门名称:" + this.dname + " | 部门地区:" + this.loc ;
	}
}