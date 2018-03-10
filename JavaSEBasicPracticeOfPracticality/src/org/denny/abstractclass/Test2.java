package org.denny.abstractclass;

public class Test2 {
	public static void main(String[] args) {
		new Y(30);
	}
}
abstract class X{
	protected int num = 100 ;
	public X(){
		System.out.println("父类的无参构造！");
		this.print(num);
	}
	public X(int num){
		System.out.println("父类的有参构造！");
		this.print(num);
	}
	abstract void print(int num) ;
}
class Y extends X{
	public Y(int num) {
		super(num) ; // 显示调用父类有参构造
	}
	@Override
	void print(int num) {
		System.out.println("super.num = " + super.num);
		System.out.println("this.num = " + this.num);
		System.out.println("num = " + num);
	}
	
}
