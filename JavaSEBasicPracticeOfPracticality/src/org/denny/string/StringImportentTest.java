package org.denny.string;

/**
 * 
 * 总结:
 * 	1、String 要使用直接赋值的方式，因为使用new的方式会开辟两个空间，造成内存浪费。
 *  2、一个字符串就是一个匿名的String对象
 *  3、字符串的比较有两种方式: == 、 equals 
 * 
 */


/**
 * String 初始化的方式
 * @author Administrator
 *
 */
class InstanceStringClassDemo1{
	String name1 = "龙永凌" ;
	String name2 = new String("龙永凌") ;
}
/**
 * 比较两个基本数据类型
 * @author Administrator
 *
 */
class BisicDataTypeTest{
	private int x = 30 ;
	private int y = 30 ;
	String equals(){
		return x == y ? "true" : "fasle" ;
	}
}
/**
 * 使用==比较name 1、2、3、的区别
 * @author Administrator
 *
 */
class LocationValueEqualsTest{
	String name1 = "龙永凌" ;
	String name2 = new String ("龙永凌") ;
	String name3 = name2 ;
}

class PseudonymObjectTest{
	String name  = "hello" ;
}

class InflexibleStringTest{
	String name1 = "hello" ;
	void iflexibleTest(){
		String name2 = name1 + "world" ;
		String name3 = name2 + "!" ;
		System.err.println("name2 = " + name2);
		System.err.println("name3 = " + name3);
		
		System.err.println("name1 = " + name1);
		System.err.println("当name1再重新指向新的引用时,那么name1之前所指向的值将被销毁，或者说指针被更新了:") ;
		name1 = name3 ;
		System.err.println("将name3的引用交给name1后:"
				+ "\nname1 = " + name1) ;
		System.err.println("name1 == name3做个比较:::::" + (name1 == name3));
		System.err.println("name1 equals name3做个比较:::::" + (name1 .equals(name3)));
	}
}

public class StringImportentTest {
	public static void main(String[] args) {
		InstanceStringClassDemo1 string = new InstanceStringClassDemo1() ;
		
		System.err.println("姓名1：" + string.name1);
		System.err.println("姓名2：" + string.name2);
		
		System.err.println("两个数字的比较结果:" + new BisicDataTypeTest().equals());
		
		System.err.println("使用==比较name 1、2、3、的区别:");
		
		LocationValueEqualsTest test = new LocationValueEqualsTest() ;
		System.err.println("name1 == name2::::" + (test.name1 == test.name2)) ;
		System.err.println("name2 == name3::::" + (test.name2 == test.name3)) ;
		System.err.println("name1 == name3::::" + (test.name1 == test.name3)) ;
		
		System.err.println("使用equals比较name 1、2、3、的区别:") ;
		System.err.println("name1 equals name2::::" + (test.name1.equals(test.name2))) ;
		System.err.println("name2 equals name3::::" + (test.name2.equals(test.name3))) ;
		System.err.println("name1 equals name3::::" + (test.name1.equals(test.name3))) ;
		
		System.err.println("测试一个字符串,如果字符串它能够直接调用String类中的方法，那么说明它就是一个匿名的String对象:");
		System.err.println("hello" .equals(new PseudonymObjectTest().name)) ;
		System.err.println("HELLO" .equalsIgnoreCase(new PseudonymObjectTest().name)) ;
		
		// 字符串的内容一旦声明，则不可改变
		new InflexibleStringTest().iflexibleTest() ;
		
	}
}
