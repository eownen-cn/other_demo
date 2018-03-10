package org.denny.interfaceclass;
/**
 * 总结:
 * 	接口的基本应用:
 * 	1、一个类可以继承多个接口
 *  2、一个抽象类也可以继承多个接口，需要注意的是被继承的接口也必须得在抽象类中得到实现。
 *  3、接口是一种特殊的类，只包含全局常量和抽象方法。
 *  4、一个普通类可以同时继承一个抽象类和实现多个接口
 *  5、接口中的抽象方法可以不加abstract，而抽象类中的抽象方法必须在修饰符之后添加abstract关键字
 *  6、接口中的属性，默认在类型前都添加了public abstract 关键字，因此属性的权限修饰符不允许更改
 *  6、一个接口也可以实现多个接口
 *  7、综上所述，接口和抽象类一样，都必须依靠(在子类实例化)子类
 *  8、它们的焦点：一个抽象类可以实现多个接口，但是一个接口不可以继承一个抽象类.
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
