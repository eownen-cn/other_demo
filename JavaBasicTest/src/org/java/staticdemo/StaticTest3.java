package org.java.staticdemo;
class A{
	private static int count ;
	public A(){
		System.out.println("��A���������е��޲ι���\n");
		count ++ ;
	}
	{
		System.out.println("��B���������еĹ����"); // ����������ڹ��췽��ִ�У�Ŀǰû������ʲô���������
		System.out.println("���ǵ�" + count + "�� A ��ʵ����");
	}
	static {
		count = 1 ;
		// ��̬����������ڹ����ִ�У��������ڳ�ʼ�����еľ�̬����
		// ��̬�����ִֻ��һ��
		System.out.println("��C���������еľ�̬�����"); 
	}
}
public class StaticTest3 {
	public static void main(String[] args) {
		new A() ;
		new A() ;
		new A() ;
		new A() ;
		new A() ;
		new A() ;
	}
}
