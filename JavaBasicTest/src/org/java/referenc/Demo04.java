package org.java.referenc;

public class Demo04 {
	public static void main(String[] args) {
		Message3 msg3= new Message3() ;
		changeData(msg3) ;
		System.out.println(msg3.getData()); // �������
		
	}
	public static void changeData(Message3 msg3) {
		msg3.setData("��ã����磡����") ;
	}
}
class Message3{
	private String data = "Hello world !!!";
	public void setData(String data) {
		this.data = data ;
	}
	public String getData() {
		return this.data ;
	}
}
