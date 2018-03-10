package org.java.referenc;

public class Demo01 {
	private static A a ;
	class A{
		private String data = "hello" ;
		public A(){} ;
		public A(String data) {
			this.data += data ;
		}
		public void setData(String data){
			this.data = data ;
		}
		public String getData(){
			return this.data ;
		}
		public void print(A that){
			System.out.println(that.getData()) ;
		}
	}
	public static void main(String args[]) {
		a = new Demo01().new A(" world") ;
		a.print(a);
		a.setData("世界，你好！");
		a.print(a);
		
		String s = "oldString" ;
		
		System.out.println(s); // s == oldString
		
		change(s) ; // s == oldString 
		// refStr == newString
		
		System.out.println(s); // s == oldString
		
		String s2 = returnAfterChange(s) ; // s == oldString
		// refStr = newString
		System.out.println(s2); //s2 == newString
	}
	/**
	 * 传递字符串到方法中，不返回修改后的结果
	 * @param refStr
	 */
	public static void change(String refStr) { 
		refStr = "newString" ; // 字符串一旦被改变，则立即开辟新的堆内存空间，因此这行代码执行完成后，refStr不再指向原字符串"oldString"
		System.out.println(refStr);
	}
	/**
	 * 传递字符串到方法中，并且返回修改后的结果
	 * @param refStr
	 */
	public static String returnAfterChange(String refStr) {
		refStr = "newString" ;
		return refStr ;
	}
}
