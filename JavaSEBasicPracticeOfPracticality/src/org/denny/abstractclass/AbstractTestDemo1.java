package org.denny.abstractclass;
/**
 * �������������
 * 	1������һ�����󷽷������Ϊ������
 *  2�������������(�ǳ������ӿڵ�)����̳�
 *  3�������಻�ܱ�ʵ����
 * @author Administrator
 *
 */
abstract class A{
	public static final String FLAG = "CHINA" ;
	private String name = "LYL" ;
	public void setName (String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public abstract void print() ;
}
class B extends A{

	@Override
	public void print() {
		System.out.println("FALG:" + FLAG);
		System.out.println("����:" + super.getName());
	}
	
}
public class AbstractTestDemo1 {
	public static void main(String[] args) {
		A a = new B() ;
		a.print();
	}
}
