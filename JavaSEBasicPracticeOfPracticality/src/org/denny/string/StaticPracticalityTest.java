package org.denny.string;

/**
 * 此案例的总结:
 * 	static关键字修饰的类属性可以被类直接调用，
 *  static关键字修的方法中不可以调用非static修饰的属性或方法。
 *  总之，static定义的任何对象，都可以优先于类的构造方法执行。
 * @author Administrator
 *
 */


// 使用基本的实例化属性的方式,与static无关
class People{
	private String name ;
	public People(){}
	public People(String name){
		setName(name) ;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "People [name=" + name + "]";
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
// 普通（非static）方法可以直接调用静态符(static)修饰的成员变量
// 并且，被static修饰后的属性，可以在类实例化之前进行赋值
class People2{
	static String name ;
	public People2(){
		System.err.println("构造方法被执行！") ;
	}
	public People2(String name){
		People2.name = name ;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "People [name=" + name + "]";
	}

	
}


public class StaticPracticalityTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		People2.name = "龙永凌1" ;
		String before = People2.name ;
		System.err.println("BeforeConstructor:::" + before);
		People2 people2 = new People2() ;
		people2.name = "龙永凌2" ;
		System.err.println("AfterConstructor:::" + people2.getName());
	}
}
