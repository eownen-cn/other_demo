package org.denny.abstractclass;
/**
 * 抽象类的特征：
 * 	1、包含一个抽象方法的类称为抽象类
 *  2、抽象类必须由(非抽象类或接口的)子类继承
 *  3、抽象类不能被实例化
 * @author Administrator
 *
 */
abstract class A{
	public static final String FLAG = "CHINA" ;
	private String name = "LYL" ;
	public void setName (String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public abstract void print() ;
}
class B extends A{

	@Override
	public void print() {
		System.out.println("FALG:" + FLAG);
		System.out.println("姓名:" + super.getName());
	}
	
}
public class AbstractTestDemo1 {
	public static void main(String[] args) {
		A a = new B() ;
		a.print();
	}
}
