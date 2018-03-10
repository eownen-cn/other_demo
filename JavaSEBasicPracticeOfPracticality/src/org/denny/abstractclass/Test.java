package org.denny.abstractclass;

/***
 * 这是继承中，涉及到的一个类似于单例模式的应用场景
 * 不同的是，以下的案例也演示了使用final定义类的另一种表现形式
 * 区别在与，final不能有子类，而以下案例只允许有一个子类
 * 该案例是 结合静态方法、抽象类、内部类、静态类、封装和多态的经典的一个实现
 * @author Ewonen-PC
 *
 */
public class Test {
	public static void main(String[] args) {
		Outer.getInstance().print();
	}
}
abstract class Outer{
	public abstract void print() ;
	
	// 以下的private表示Outer有且只有Inner这一个子类时的应用场景
	// 目的就是为用户隐藏不需要的子类， 但同时外部依然可以通过静态方法getInstance()得到其内部类的实例
	private static class Inner extends Outer{ 

		public void print() { // 覆写Outer中的方法
			System.out.println("Hello world !!!");
		}
		
	}
	static Outer getInstance(){ // 返回内部的子类 
		return new Inner() ;
	}
}
