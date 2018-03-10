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
		Outer outer = new Outer("����:::: Ĭ�Ϸ����ڲ����к���(��:print())�ķ���!") ;
		Outer.Inner inner = outer.new Inner() ;
		inner.print();
		new Outer("����:::: ��ӷ����ڲ����к���(��:print())�ķ���!").fun() ;
	}
}
