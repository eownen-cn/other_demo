package org.denny.innerclass;

class Outer{
	private String info ;
	public Outer(){}
	public Outer(String info){
		this.info = info ;
	}
	class Inner{
		public void print(){
			System.err.println(info) ;
		}
	}
	public void fun(){
		new Inner().print();
	}
}


public class OuterForInnerDemo01 {
	public static void main(String[] args) {
		Outer outer = new Outer("这是:::: 默认访问内部类中函数(如:print())的方法!") ;
		Outer.Inner inner = outer.new Inner() ;
		inner.print();
		new Outer("这是:::: 间接访问内部类中函数(如:print())的方法!").fun() ;
	}
}
