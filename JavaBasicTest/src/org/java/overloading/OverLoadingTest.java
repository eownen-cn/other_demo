package org.java.overloading;
/***
 * 方法的重载(Overloading)，总结:
 * 定义：重载后的方法与原方法同名，重载的意义与方法的修饰符和返回值无关
 * 作用:以不同的参数列表(参数个数以及类型)的形式来弥补原方法无法做到的功能，或者完成更多丰富功能
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
		System.out.println(param + " world !!!" + "今天的幸运数字是：" + luckyNumber);
	}
	private void print(String param,String ...arguments) {
		System.out.println(param + " world !!!");
		for (String s : arguments) {
			System.out.print(s + "、");
		}
	}
	public String print(int more) {
		return this.data + " world !!!" + more ;
	}
	
}