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
		a.setData("���磬��ã�");
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
	 * �����ַ����������У��������޸ĺ�Ľ��
	 * @param refStr
	 */
	public static void change(String refStr) { 
		refStr = "newString" ; // �ַ���һ�����ı䣬�����������µĶ��ڴ�ռ䣬������д���ִ����ɺ�refStr����ָ��ԭ�ַ���"oldString"
		System.out.println(refStr);
	}
	/**
	 * �����ַ����������У����ҷ����޸ĺ�Ľ��
	 * @param refStr
	 */
	public static String returnAfterChange(String refStr) {
		refStr = "newString" ;
		return refStr ;
	}
}
