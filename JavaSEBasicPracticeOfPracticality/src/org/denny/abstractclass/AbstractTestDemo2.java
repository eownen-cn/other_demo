package org.denny.abstractclass;
/**
 * �������������
 * 	1������һ�����󷽷������Ϊ������
 *  2�������������(�ǳ������ӿڵ�)����̳�
 *  3�������౾���ܱ�ʵ����
 *  4�����Ա����������������ʵ�������췽��
 *  5����������ʹ���вι��췽��ʱ������õ��Ǹ�����޲ι��췽����
 * @author Administrator
 *
 */
abstract class A2{
	protected String info;
	public A2(){
		System.err.println("����A2�Ĺ�����") ;
	}
	public A2(String info){
		this.info = info ;
	}
	public void print(){
		System.err.println("�����е�info��ֵ��:" + this.info) ;
	}
}
class B2 extends A2{
	private String info;
	public B2(){
		System.err.println("����B2�Ĺ�����") ;
	}
	public B2(String info){
		this.info = info ;
	}
	public void print(){
		System.err.println("�����е�info��ֵ��" + super.info) ;
		System.err.println("�����е�info��ֵ��" + this.info) ;
		System.err.println("Ĭ�ϵ����ˣ�" + ((info != null)? "����info": "����info")) ;
	}
}
public class AbstractTestDemo2 {
	public static void main(String[] args) {
		System.err.println("ʵ���������޲ι��췽��\n");
		new B2().print() ;
		System.err.println("\n\n==========================");
		System.err.println("==========================\n\n");
		System.err.println("ʵ���������вι��췽��\n");
		new B2("Denny").print() ;
	}
}
