package org.denny.interfaceclass;
/**
 * �ܽ�:
 * 	�ӿڵĻ���Ӧ��:
 * 	1��һ������Լ̳ж���ӿ�
 *  2��һ��������Ҳ���Լ̳ж���ӿڣ���Ҫע����Ǳ��̳еĽӿ�Ҳ������ڳ������еõ�ʵ�֡�
 *  3���ӿ���һ��������ֻ࣬����ȫ�ֳ����ͳ��󷽷���
 *  4��һ����ͨ�����ͬʱ�̳�һ���������ʵ�ֶ���ӿ�
 *  5���ӿ��еĳ��󷽷����Բ���abstract�����������еĳ��󷽷����������η�֮�����abstract�ؼ���
 *  6���ӿ��е����ԣ�Ĭ��������ǰ�������public abstract �ؼ��֣�������Ե�Ȩ�����η����������
 *  6��һ���ӿ�Ҳ����ʵ�ֶ���ӿ�
 *  7�������������ӿںͳ�����һ��������������(������ʵ����)����
 *  8�����ǵĽ��㣺һ�����������ʵ�ֶ���ӿڣ�����һ���ӿڲ����Լ̳�һ��������.
 * @author Administrator
 *
 */
interface A{
	public String AUTHOR = "Denny" ;
	public void print() ;
	public String getAuthor() ;
}
interface B{
	public void sayHi() ;
}
abstract class D implements A,B{
	private String data ;
	public D() {}
	public D(String data) {this.data = data ;}
	public String print2(){
		return this.data ;
	}
	public void sayHi() {
		print() ;
	}

	public void print() {
		System.err.println("Hi " + getAuthor() + "!!!") ;
	}

	public String getAuthor() {
		return AUTHOR;
	}
	public abstract void printf() ;
}
class C extends D{
	public void printf() {
		print() ;
	}
}

interface X{
	String info = "X" ;
}
interface Y{
	String info = "Y" ;
}
interface Z{
	String info = "Z" ;
}
interface MyInterface extends X,Y,Z{
	String print() ;
}
class TestExtendsByInterfaces implements MyInterface{

	public String print() {
		return "X + Y + Z = " + X.info + Y.info + Z.info ;
	}
	
}
public class InterfacesTestDemo1 {
	public static void main(String[] args) {
		C c = new C() ;
		c.printf();
		String result = new TestExtendsByInterfaces().print() ;
		System.out.println(result);
	}
}
