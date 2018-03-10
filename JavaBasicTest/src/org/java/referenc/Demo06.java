package org.java.referenc;
/**
 * ���ݱ�ӳ��
 * 1��һ�Զ�
 * 2�����һ
 * ����Ҫ��:�����úø��ԵĶ������ԣ��ڿ��ǹ�ϵ(����)����
 * �ѵ�:������ϵ�Ĵ���һ��ҪŪ�������ʲô������ʲô��һ��һ��������
 * @author Ewonen-PC
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		// ��һ�����������Զ�������
		Dept dept = new Dept(10, "ACCOUNTING", "New York") ;
		Emp ea = new Emp(7369,"SMITH","CLERK",800.0) ; // ˹��˹
		Emp eb = new Emp(7902,"FORD","MANAGER",2450.0) ; // ����
		Emp ec = new Emp(7369,"KING","PRESIDENT",5000.0) ; // ��
		
		// �ڶ��������ù�Ա���쵼��ϵ
		ea.setMgr(eb);
		eb.setMgr(ec);
		
		// �����������ù�Ա�Ͳ��Ź�ϵ
		ea.setDept(dept);
		eb.setDept(dept);
		ec.setDept(dept);
		
		// ���Թ�Ա��Ϣ�Ƿ�����
		System.out.println(ea.getInfo());
		System.out.println(eb.getInfo());
		System.out.println(ec.getInfo());
		
		// ���Բ�����Ϣ�Ƿ�����
		System.out.println(dept.getInfo());
		
		// ͨ����Ա�ҵ������ڲ���
		System.out.println("ͨ����Ա�Ҳ��� ==> " + ea.getDept().getInfo());
		System.out.println("ͨ����Ա�ҵ����ϼ����ڵĲ�����Ϣ ==> " + ea.getMgr().getDept().getInfo());
		System.out.println("ͨ����Ա�ҵ����ϼ����ϼ�����Ϣ ==> " + ea.getMgr().getMgr().getInfo());
		System.out.println("ͨ����Ա�ҵ����ϼ����ϼ����ڵĲ�����Ϣ ==> " + ea.getMgr().getMgr().getDept().getInfo());
		
		// �����Ƕ��һ 
		// ��������һ�Զ�
		
		// ��һ����Ϊ������ӹ�Ա��Ϣ
		dept.setEmps(new Emp[]{ea,eb,ec});
		
		// �ڶ��������ݲ���ȡ���ò������й�Ա��Ϣ
		Emp[] emps= dept.getEmps() ; // ��ȡ�ò��ţ�dept���µ����й�Ա
		System.out.println("\n-----------------------------�����ķָ���-----------------------------\n");
		for (int a = 0 ; a < emps.length ; a ++) { // �����Ա��Ϣ
			System.out.println(emps[a].getInfo());
			if (emps[a].getMgr() != null) {
				System.out.println("�쵼��Ϣ��" + emps[a].getMgr().getInfo());
			} else {
				System.out.println("�쵼��Ϣ��" + null);
			}
			System.out.println();
		}
 	}
}
/**
 * ��Ա��
 * @author Ewonen-PC
 *
 */
class Emp{
	private int empno ; // ��Ա���
	private String ename ; // ����
	private String job ; // ������λ
	private double sal ; // ����
	private Emp mgr ; // ��Ա���ϼ��쵼
	private Dept dept ; // ��Ա���ڵĲ���
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
		return "��Ա���:" + this.empno + " | ����:" + this.ename + " | ��λ:" + this.job + " | ����:" + this.sal ;
	}
}
/**
 * ��Ա�Ĳ��ű�
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
		return "���ű��:" + this.deptno + " | ��������:" + this.dname + " | ���ŵ���:" + this.loc ;
	}
}