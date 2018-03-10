package org.denny.string;

/**
 * 测试:构造块、静态代码块、构造方法块，在实例化时前后的执行顺序。
 * 总结:
 * 1、它们的执行顺序 就如以上.
 * 2、实验证明:静态代码块优先于类中的构造块儿、而构造块又优先于构造方法块。
 * 3、静态代码块只执行一次，与类的实例化无关。
 * @author Administrator
 *
 */

class Demo01{
	static {
		System.err.println("This is static code block！") ;
	}
	{
		System.err.println("This is construct code block！");
	}
	public Demo01(){
		System.err.println("This is constructor code block！");
	}
	public Demo01(String name){
		System.err.println(name);
	}
}
		
		
public class AboutCodeBlockTest {
	public static void main(String[] args) {
		new Demo01() ;
		System.err.println() ;
		new Demo01() ;
		System.err.println() ;
		new Demo01() ;
		System.err.println() ;
		new Demo01("This is contains prameters constructor code block！") ;
		System.err.println() ;
		new Demo01("This is contains prameters constructor code block！") ;
	}
}
