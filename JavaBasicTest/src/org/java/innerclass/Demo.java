package org.java.innerclass;

class Outer {
	private String msg = "【A】Hello world!!!";
	public Outer(){
		System.out.println("Outer class instance successfully!!!");
	}
	class Inner{
		public Inner(){
			System.out.println("Inner class instance successfully!!!");
		}
		void print(){
			System.out.println("【A】内部类print()方法-----------" + Outer.this.msg);
		}
	}
}

class Outer2{
	static String msg = "【B】Hello world!!!";
	public Outer2(){
		System.out.println("Outer2 class instance successfully!!!");
	}
	static class Inner2{
		public Inner2(){
			System.out.println("Inner2 class instance successfully!!!");
		}
		void print(){
			System.out.println("【B】内部类print()方法-----------" + Outer2.msg);
		}
		public static void staticFun(){
			System.out.println("【B】The method of static function in the static inner class-----------" + Outer2.msg);
		}
	}
}

class Outer3{
	private String msg = "你好，世界！";
	public void fun(int x) {
		double price = 99.0 ;
		class Inner3{
			public void print(){
				System.out.println(Outer3.this.msg);
				System.out.println("方法中的参数：" + x);
				System.out.println("方法中的变量：" + price);
			}
		}
		new Inner3().print() ;
	}
}

public class Demo {
	public static void main(String[] args) {
		
		// 默认内部类
		Outer.Inner in = new Outer().new Inner() ;
		in.print();
		
		// 静态内部类
		Outer2.Inner2 in2 = new Outer2.Inner2() ;
		in2.print();
		Outer2.Inner2.staticFun(); // 静态内部类的静态方法可以直接使用“外部类.内部类.方法名”调用
		
		// 方法中定义内部类
		new Outer3().fun(100); 
	}
}
