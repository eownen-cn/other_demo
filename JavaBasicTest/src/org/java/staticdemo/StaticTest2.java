package org.java.staticdemo;
class Book{
	/**
	 * ��̬����СӦ�ã���¼���ʵ������
	 */
	private static int instanceCount ;
	public Book(){
		instanceCount ++ ;
		System.out.println("���ǵ�" + instanceCount + "��ʵ��������");
	}
}
public class StaticTest2 {
	public static void main(String[] args) {
		new Book() ;
		new Book() ;
		new Book() ;
		new Book() ;
		new Book() ;
		new Book() ;
	}
}
