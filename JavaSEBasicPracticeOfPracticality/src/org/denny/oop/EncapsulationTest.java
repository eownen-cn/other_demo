package org.denny.oop;
/**
 * Java OOP-��װ�Բ���
 * 
 * ����:	���е����г�Ա�ͷ���Ĭ�϶�����default���η����Σ������η� defaultָ��
 * �����б����εĳ�Ա����ͬһ�����µ�����������ֱ�ӷ��ʡ�
 * 		Ϊ���ó�����廯���Լ���˽������ֻ����������ʺͿ��ƣ�private���η�����Ϊ���е�����
 * ���Ӳ��ɱ��ⲿ����ʵ�Ȩ�ޣ�������ⲿ����Ҫ���ʱ���˽������ʱ���ɸ�public String getXxx()
 * �����������ص����ݡ����ˣ�ʵ�������ݵĸ��廯������װ�� 	
 * 
 * @author Administrator
 *
 */

/**
 * person ��
 * @author Administrator
 *
 */
class Person{
	String name ;
	int age ;
	void print(){
		System.err.println("����:" + name + "������:" + age) ;
	}
}

class Person2{
	private String name ;
	private int age ;
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public int getAge(){
		return this.age ;
	}
	
	void print(){
		System.err.println("����:" + getName() + "������:" + getAge()) ;
	}
}
public class EncapsulationTest {
	public static void main(String[] args) {
		Person person = new Person() ;
		person.name = "������" ;					
		person.age = 22 ;
		person.print();
		
		Person2 person2 = new Person2() ;
		person2.setName("������");
		person2.setAge(22); 
		person2.print();
	}
}
