package org.java.overloading;
/***
 * ����������(Overloading)���ܽ�:
 * ���壺���غ�ķ�����ԭ����ͬ�������ص������뷽�������η��ͷ���ֵ�޹�
 * ����:�Բ�ͬ�Ĳ����б�(���������Լ�����)����ʽ���ֲ�ԭ�����޷������Ĺ��ܣ�������ɸ���ḻ����
 * @author Ewonen-PC
 *
 */
public class OverLoadingTest {
	public static void main(String[] args) {
		new A().fun();
	}
}
class A{
	private String data = "Hello" ;
	public void fun() {
		this.print();
		this.print(data);
		this.print(data,898989);
		this.print(data,"A","B","C","D","E") ;
		System.out.println(this.print(168)) ;
	}
	public void print(){
		System.out.println(this.data + " world !!!");
	}
	protected void print(String param) {
		System.out.println(param + " world !!!");
	}
	void print(String param,int luckyNumber) {
		System.out.println(param + " world !!!" + "��������������ǣ�" + luckyNumber);
	}
	private void print(String param,String ...arguments) {
		System.out.println(param + " world !!!");
		for (String s : arguments) {
			System.out.print(s + "��");
		}
	}
	public String print(int more) {
		return this.data + " world !!!" + more ;
	}
	
}