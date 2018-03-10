package org.java8.test;


/**
 * 函数式接口
 * @author Ewonen-PC
 *
 */
public class AboutFunctionInterface {
	public static void main(String [] args) {
		
		Convertor<String, Integer> c = (from) -> Integer.valueOf(from);
		Integer converted = c.convert("123") ;
		System.out.println(converted * 2);    // 246
		
	}
}

