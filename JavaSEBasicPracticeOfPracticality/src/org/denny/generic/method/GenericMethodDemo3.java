package org.denny.generic.method;
/**
 * ʹ�÷��͹涨����������ʱ��ͳһ���͡�
 * @author Administrator
 *
 */
class Demo3<T extends Object>{
	private T obj ;

	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public String toString() {
		return "������Ϣ:" + this.obj + "\n" + "��ǰ�����������:" + this.getClass().getName() ;
	}
	public void beforeDestroy(){
		System.err.println("�жϴ���Ķ����Ƿ���Demo2����:" + (this.obj instanceof Demo2));
		System.err.println("�жϴ���Ķ����Ƿ���Integer����:" + (this.obj instanceof Integer));
		System.err.println("�жϴ���Ķ����Ƿ���org.denny.generic.method.Demo2����:" + (this.obj instanceof org.denny.generic.method.Demo2));
	}
}
public class GenericMethodDemo3 {
	public static void main(String[] args) {
		Demo3<String> d1 = new Demo3<String>() ;
		Demo3<String> d2 = new Demo3<String>() ;
		d1.setObj("���ã�");
		d2.setObj("������");	
		add(d1,d2) ;
	}
	public static <T> void add(Demo3<T> obj1 , Demo3<T> obj2){
		System.err.println(obj1.getObj() + " " + obj2.getObj()) ;
	}
}
