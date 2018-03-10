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
		new Outer2.Inner("Ϊ�ڲ������static���η���֮���ٷ����ڲ����еķ���!").print() ;
	}
}
