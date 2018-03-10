package org.java.staticdemo;

class Demo01{
	/***
	 * 1、静态属性和方法是全局的，公用的，可以不通过类的实例直接使用类名.属性名调用
	 * 2、静态方法中，不可以使用类中非静态属性，反之，普通方法可以使用类中任何属性
	 * 3、静态的属性或方法都不能使用this调用，编译都不能通过
	 * 4、静态类，还没见过，应该也没意义
	 */
	static String data = "hello world !!!" ;
	private String name ;
	private String habby ;
	public Demo01(String name , String habby) {
		this.name = name ;
		this.habby = habby ;
	}
	public String getInfo(){
		return "姓名:" + this.name + " | 爱好:" + this.habby + " | 其他:" + Demo01.data ;
	}
}

public class StaticTest1 {
	public static void main(String args[]) {
		Demo01 d1 = new Demo01("龙永凌","敲代码") ;
		Demo01 d2 = new Demo01("成龙","拍片") ;
		Demo01.data = "你好，世界！！！" ;
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		Demo01.data = "今天天气很好！" ;
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		Demo01.data = "今天天气很不错！" ;
		System.out.println(d2.getInfo());
	}
}
