package org.java.oop;

public class StackTest {
	public static void main(String [] args) {
		Book bk1 = null ; // ��������
		Book bk2 = null ; // ��������
		Book bk3 = null ; // ��������
		bk1 = new Book("JavaWeb����",89.8) ; // ʵ�������󣬲���ֵ������
		bk2 = bk1 ; // ���ô���
		bk3 = bk1 ; // ���ô���
		System.out.println(bk1.getInfo());
		bk2.setPrice(58.9);
		System.out.println(bk1.getInfo());
		
		bk2 = new Book("ˮ䰴�",38.8) ;
		System.out.println(bk2.getInfo()) ;
		System.out.println(bk1.getInfo()) ;
		bk1 = bk2 ;
		System.out.println(bk1.getInfo()) ;
		bk1 = bk3 ;
		System.out.println(bk1.getInfo()) ;
		/**
		 * �ܽ� �� ջ�ڴ��������洢�����������ͣ�����Ƕ�������ã���ôʵ���ϸ������Ǳ������������ָ��ĳ���ڴ�ĵ�ֵַ
		 * һ��ջ�ڴ�����ֻ��ָ��һ�����ڴ棬��һ�����ڴ�ռ����ָ����ջ�ڴ����ã�һ��û�б��κ�ջ�ڴ�ָ���������
		 * �����ڵı������ռ�����GC�����л���
		 */
	}
}
