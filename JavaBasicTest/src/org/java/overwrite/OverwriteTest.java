package org.java.overwrite;
/***
 * ��������д(Orverwrite),�ܽ�
 * 1����������д�Ƕ�̬��һ�ֱ�����ʽ��Ҳ��Ϊ�����ĸ�д
 * 2����������д�����ص���ʽ������ͬ��������ʽ���ڲ����б���
 * 3����ͬ���Ǳ���д�ķ��������бȸ��෽�������޵ķ���Ȩ�ޣ��Լ����෽���뱻��д�ķ����ķ���ֵ���뱣��һ��
 * 
 * 4 �� 	һ�仰�������ǵ�����
 * 		һ������£�������ʱ�����ݲ��ܣ������Ľṹ������ȫ��ͬ��������дʱ�����ݲ��ܣ��������б��⣬�����Ľṹ�ñ���һ��
 * @author Ewonen-PC
 *
 */
public class OverwriteTest {
	public static void main(String[] args) {
		new B().print();
	}
}
class A{
	void fun(){
		System.out.println("A:����A���е�fun()����.");
	}
	public void print(){
		this.fun() ;
	}
}
class B extends A{
	public void fun(String data){
		System.out.println("B:����B���е�fun()����." + data);
	}

	public void fun(String data,int luckyNumber){
		System.out.println("B:����B���е�fun()����." + data + luckyNumber);
	}
	public void fun(String data,int luckyNumber,String t){
		System.out.println("B:����B���е�fun()����." + data + luckyNumber + t);
	}
	public void print(){
		this.fun("Hello world !!!") ;
		this.fun("Hello world !!!",1232432) ;
		this.fun("Hello world !!!",1232432,"����������~") ;
		super.print();
	}
}
