package org.java.staticdemo;
class Book{
	/**
	 * 静态属性小应用：记录类的实例个数
	 */
	private static int instanceCount ;
	public Book(){
		instanceCount ++ ;
		System.out.println("这是第" + instanceCount + "个实例化对象！");
	}
}
public class StaticTest2 {
	public static void main(String[] args) {
		new Book() ;
		new Book() ;
		new Book() ;
		new Book() ;
		new Book() ;
		new Book() ;
	}
}
