package org.denny.abstractclass;
/**
 * 抽象类的特征：
 * 	1、包含一个抽象方法的类称为抽象类
 *  2、抽象类必须由(非抽象类或接口的)子类继承
 *  3、抽象类本身不能被实例化
 *  4、可以被派生的子类调用其实例化构造方法
 *  5、在子类中使用有参构造方的时候，其调用的是父类的无参构造方法。
 * @author Administrator
 *
 */
abstract class A2{
	protected String info;
	public A2(){
		System.err.println("父类A2的构造器") ;
	}
	public A2(String info){
		this.info = info ;
	}
	public void print(){
		System.err.println("父类中的info的值是:" + this.info) ;
	}
}
class B2 extends A2{
	private String info;
	public B2(){
		System.err.println("子类B2的构造器") ;
	}
	public B2(String info){
		this.info = info ;
	}
	public void print(){
		System.err.println("父类中的info的值：" + super.info) ;
		System.err.println("子类中的info的值：" + this.info) ;
		System.err.println("默认调用了：" + ((info != null)? "子类info": "父类info")) ;
	}
}
public class AbstractTestDemo2 {
	public static void main(String[] args) {
		System.err.println("实例化子类无参构造方法\n");
		new B2().print() ;
		System.err.println("\n\n==========================");
		System.err.println("==========================\n\n");
		System.err.println("实例化子类有参构造方法\n");
		new B2("Denny").print() ;
	}
}
