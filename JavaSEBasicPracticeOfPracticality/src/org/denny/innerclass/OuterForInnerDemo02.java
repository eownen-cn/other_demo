package org.denny.innerclass;

class Outer2{
	static class Inner{
		private String info ;
		public Inner(){}
		public Inner(String info){
			this.info = info ;
		}
		public void print(){
			System.err.println(info) ;
		}
	}
}


public class OuterForInnerDemo02 {
	public static void main(String[] args) {
		new Outer2.Inner("为内部类添加static修饰符，之后再访问内部类中的方法!").print() ;
	}
}
