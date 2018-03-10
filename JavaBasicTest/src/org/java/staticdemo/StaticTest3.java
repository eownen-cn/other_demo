package org.java.staticdemo;
class A{
	private static int count ;
	public A(){
		System.out.println("【A】这是类中的无参构造\n");
		count ++ ;
	}
	{
		System.out.println("【B】这是类中的构造快"); // 构造块优先于构造方法执行，目前没发现有什么具体的作用
		System.out.println("这是第" + count + "个 A 的实例！");
	}
	static {
		count = 1 ;
		// 静态代码块优先于构造快执行，可以用于初始化类中的静态属性
		// 静态代码块只执行一次
		System.out.println("【C】这是类中的静态代码块"); 
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
