package org.denny.generic.method;
/**
 * ����ʲô���ͣ��򷵻�ʲô���͡�
 * �����м����ҵ���߼�
 * @author Administrator
 *
 */
class Demo{
	public <T>T fun(T t){
		// ҵ���߼�
		return t ;
	}
}
public class GenericMethodDemo1 {
	public static void main(String[] args) {
		Demo d = new Demo() ;
		System.err.println(d.fun("������")) ;
		Demo d2 = new Demo() ;
		System.err.println(d2.fun(123)) ;
	}
}
