package org.java.referenc;

public class Demo02 {
	public static void main(String[] args) {
		Message msg = new Message() ;
		msg.setData(50) ;
		changeData(msg) ;
		System.out.println(msg.getData());
	}
	public static void changeData(Message msg) {
		msg.setData(100);
	}
}
class Message{
	private int data ;
	public void setData(int data) {
		this.data = data ;
	}
	public int getData() {
		return this.data ;
	}
}
