package org.denny.generic.method;
/**
 * �ڷ�����ָ�����͵����޺�����
 * public static <T extends Number> Demo2<T> fun(T obj){}
 * �����Ϸ��������Ը��ݴ���Ĳ�����ʵ����������һ���������ʵ����
 * �����ķ���ֵ��ǰ/��������.
 * ǰ��: <T extends/super Number> ��ʾ���ø÷��ͷ�������ֵ�����޻�����
 * ����: Demo2<T> ��ʾ���ø÷��ͷ����ķ���ֵ����һ����������������о����ģ���
 * ǰ�ߵ������ޣ��������ɶ��ƣ���Ҳ���������Demo2<T>�е�T,���߲���ͨ�����롣
 * 
 * @author Administrator
 *
 */
class Demo2<T extends Object>{
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
public class GenericMethodDemo2 {
	public static void main(String[] args) {
		Demo2<Integer> d = fun(3000) ;
		System.err.println(d) ;
		d.beforeDestroy();
	}
	public static <T extends Number> Demo2<T> fun(T obj){
		Demo2<T> object = new Demo2<T>() ;
		object.setObj(obj);	
		return object ;
	}
}
