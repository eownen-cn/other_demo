package org.java.packing;
class Entity {
	
}
interface A{
	static Entity getInstance = null ;
	public void print() ;
	static Entity getInstance() {
		return getInstance == null ? new Entity() : getInstance ;
	}
}

interface Message{
	public String print(String d) ;
}

public class Test {
	public static String fun(Message msg,String d){
		return msg.print(d) ;
	}
	public static void main(String[] args) {
		System.out.println(fun( (String d) -> "Hello" + d , " world !!!" )) ; // Lambda±Ì¥Ô Ω
	}
	public static void printf(Object ...obj) {
		for(Object o : obj) {
			System.out.println(o);
		}
	}
}
