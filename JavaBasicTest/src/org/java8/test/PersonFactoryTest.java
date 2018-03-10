package org.java8.test;

public class PersonFactoryTest implements PersonFactory<Person> {

	@Override
	public Person create(String firstName, String lastName) {
		return new Person(firstName,lastName) ;
	}
	
	public static void main(String[] args) {
		//Lambda作用域
		demo01() ;
		demo02() ;
//		demo03() ; //错误的范例
		new PersonFactoryTest().demo04();
	}
	public static void demo01() {
		PersonFactory<Person> pf = Person::new ;
		Person person = pf.create("Hello", "world") ;
		System.err.println(person);
	}
	
	
	/**
	 * Lambda内部访问外层的局部变量
	 */
	private static void demo02() {
		int num = 1 ; // 外层局部变量
		Convertor<Integer,String> toIdTool = (param) -> String.valueOf("你" + num + "好" + 2) ;
		String temp = toIdTool.convert(2) ;
		System.out.println(temp);
	}
	
	
	/**
	 * Lambda内部访问外层的局部变量后，外层局部变量被隐式转换为final形式的变量，后续不可对其操作
	 */
	private static void demo03() {
		int num = 1 ; //num在此处声明
		Convertor<Integer,String> toIdTool = null ;
		// 这里的num必须不可被后面的代码修改（即隐性的具有final的语义）
//		toIdTool = (param) -> String.valueOf("你" + num + "好" + 2) ; // num在这里被隐式转换为final定义的常量，因此后续不可被更改
		String temp = toIdTool.convert(2) ;
		num=3 ; //此行代码将导致编译不通过
		System.out.println(temp);
	}

	
	private static int num2 = 2002 ; // 对象静态字段
	int num = 1 ; // num在此处声明,表对象字段
	private void demo04() {
		Convertor<Integer,String> toIdTool = null ;
		toIdTool = (param) -> {
			return String.valueOf("你" + (num + num2 - num2) + "好" + param); 
		} ;
		String temp = toIdTool.convert(2) ;
		System.out.println(temp);
	}
}
