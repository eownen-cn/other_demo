package org.java.referenc;

public class Demo03 {
	public static void main(String[] args) {
		String data = "Hello wrold !!!" ;
		changeData(data) ;
		System.out.println(new Message2().getData()); // hello world
	}
	public static void changeData(String data) {
		data = "��ã����磡" ; // �ַ����ǲ��ɸı䣬�����������֮�󿪱����µ��ڴ档 ��ˣ��˴���data��Messageʵ����data����Ϊ��ֵַ��ͬ�� 
	}
}
class Message2{
	private String data = "Hello world !!!" ;
	public String getData() {
		return this.data ;
	}
}
