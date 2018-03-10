package org.java.pointthis;
class A{
	private B b ;
	public A() {
		System.out.println("实例化A类的无参构造！");
		this.b = new B(this) ;
		this.b.get();
	}
	public void print(String data) {
		System.out.println(data) ;
	}
}
class B{
	private String data ;
	public B() {
		System.out.println("实例化B类的无参构造！") ;
	} ;
	public B(String data){
		this() ;
		this.data = data ;
		System.out.println("实例化B类，参数列表为:（String data）的有参构造！并已把B类中的属性赋值") ;
	}
	private A a ;
	public B(A a) {
		this("Hello world !!!") ;
		System.out.println("实例化B类，参数列表为:（A a）的有参构造！") ;
		if ( a instanceof A && null != a) {
			this.a = a ;
		} else {
			return ;
		}
	}
	public void get(){
		System.out.println("调用A类的print方法");
		this.a.print(this.data) ;
	}
}
/***
 * this 关键字
 * 总结：目前来看，this分两种情况的使用
 * 1、第一种情况：当使用this调用类中属性或方法的时候，this代表的是当前类
 *   当使用this调用属性的时候，this代表当前类中的唯一标识符
 * 2、第二种情况：当使用this作为引用传递的时候，this代表当前调用环境的对象(即当前正活动的类对象)
 * @author Ewonen-PC
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		new A() ;
	}
}
