package org.java.innerclass;

class Outer {
	private String msg = "��A��Hello world!!!";
	public Outer(){
		System.out.println("Outer class instance successfully!!!");
	}
	class Inner{
		public Inner(){
			System.out.println("Inner class instance successfully!!!");
		}
		void print(){
			System.out.println("��A���ڲ���print()����-----------" + Outer.this.msg);
		}
	}
}

class Outer2{
	static String msg = "��B��Hello world!!!";
	public Outer2(){
		System.out.println("Outer2 class instance successfully!!!");
	}
	static class Inner2{
		public Inner2(){
			System.out.println("Inner2 class instance successfully!!!");
		}
		void print(){
			System.out.println("��B���ڲ���print()����-----------" + Outer2.msg);
		}
		public static void staticFun(){
			System.out.println("��B��The method of static function in the static inner class-----------" + Outer2.msg);
		}
	}
}

class Outer3{
	private String msg = "��ã����磡";
	public void fun(int x) {
		double price = 99.0 ;
		class Inner3{
			public void print(){
				System.out.println(Outer3.this.msg);
				System.out.println("�����еĲ�����" + x);
				System.out.println("�����еı�����" + price);
			}
		}
		new Inner3().print() ;
	}
}

public class Demo {
	public static void main(String[] args) {
		
		// Ĭ���ڲ���
		Outer.Inner in = new Outer().new Inner() ;
		in.print();
		
		// ��̬�ڲ���
		Outer2.Inner2 in2 = new Outer2.Inner2() ;
		in2.print();
		Outer2.Inner2.staticFun(); // ��̬�ڲ���ľ�̬��������ֱ��ʹ�á��ⲿ��.�ڲ���.������������
		
		// �����ж����ڲ���
		new Outer3().fun(100); 
	}
}
