package org.java.overwrite;
/***
 * 方法的重写(Orverwrite),总结
 * 1、方法的重写是多态的一种表现形式，也称为方法的覆写
 * 2、方法的重写和重载的形式基本相同，表现形式都在参数列表上
 * 3、不同的是被覆写的方法不能有比父类方法更局限的访问权限，以及父类方法与被覆写的方法的返回值必须保持一致
 * 
 * 4 、 	一句话概括它们的区别：
 * 		一般情况下，在重载时，内容不管，方法的结构不能完全相同，而在重写时，内容不管，除参数列表外，方法的结构得保持一致
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
		System.out.println("A:这是A类中的fun()方法.");
	}
	public void print(){
		this.fun() ;
	}
}
class B extends A{
	public void fun(String data){
		System.out.println("B:这是B类中的fun()方法." + data);
	}

	public void fun(String data,int luckyNumber){
		System.out.println("B:这是B类中的fun()方法." + data + luckyNumber);
	}
	public void fun(String data,int luckyNumber,String t){
		System.out.println("B:这是B类中的fun()方法." + data + luckyNumber + t);
	}
	public void print(){
		this.fun("Hello world !!!") ;
		this.fun("Hello world !!!",1232432) ;
		this.fun("Hello world !!!",1232432,"啦啦啦啦啦~") ;
		super.print();
	}
}
