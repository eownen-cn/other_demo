package org.java.referenc;

public class Demo03 {
	public static void main(String[] args) {
		String data = "Hello wrold !!!" ;
		changeData(data) ;
		System.out.println(new Message2().getData()); // hello world
	}
	public static void changeData(String data) {
		data = "你好，世界！" ; // 字符串是不可改变，所以这个操作之后开辟了新的内存。 因此，此处的data非Message实例的data，因为地址值不同了 
	}
}
class Message2{
	private String data = "Hello world !!!" ;
	public String getData() {
		return this.data ;
	}
}
