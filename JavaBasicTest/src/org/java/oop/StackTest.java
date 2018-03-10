package org.java.oop;

public class StackTest {
	public static void main(String [] args) {
		Book bk1 = null ; // 变量声明
		Book bk2 = null ; // 变量声明
		Book bk3 = null ; // 变量声明
		bk1 = new Book("JavaWeb开发",89.8) ; // 实例化对象，并赋值给变量
		bk2 = bk1 ; // 引用传递
		bk3 = bk1 ; // 引用传递
		System.out.println(bk1.getInfo());
		bk2.setPrice(58.9);
		System.out.println(bk1.getInfo());
		
		bk2 = new Book("水浒传",38.8) ;
		System.out.println(bk2.getInfo()) ;
		System.out.println(bk1.getInfo()) ;
		bk1 = bk2 ;
		System.out.println(bk1.getInfo()) ;
		bk1 = bk3 ;
		System.out.println(bk1.getInfo()) ;
		/**
		 * 总结 ， 栈内存是用来存储基本数据类型，如果是对象的引用，那么实际上该引用是保存的是其引用指向某堆内存的地址值
		 * 一个栈内存引用只能指向一个堆内存，而一个堆内存空间可以指向多个栈内存引用，一块没有被任何栈内存指向的垃圾会
		 * 不定期的被垃圾收集器（GC）进行回收
		 */
	}
}
