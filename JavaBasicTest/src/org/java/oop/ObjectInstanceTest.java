package org.java.oop;
/**
 * 本单元基本目标：
 * 1、了解Java程序的基本构建形式，以及面向对象的基本特征
 * 2、了解对象与类的基本关系。
 * 3、类，是用来描述对象特征的一种抽象的概念，
 * 而对象是通过一个类来完成创建的，
 * 因此类也看作是一个产品诞生的模型,
 * 没有实例化的对象等于是不能操作类中的方法及属性的。
 * @author Ewonen-PC
 *
 */
public class ObjectInstanceTest {
	public static void main(String[] args) {
		Book bk = null ;
		bk = new Book("红楼梦",99.8) ; // 对象创建后必须实例化之后才能使用其属性，否则抛出NullPointerException
		String info = bk.getInfo();
		System.out.println(info) ;
	}
}
