package org.java.designpattern;
/***
 * 工厂方法的核心就是，原本为实体类产生对象实例的操作交由工厂方法来完成，并隐藏操作细节
 * @author Ewonen-PC
 *
 */
public class TheDesignPatternOfFactory {
	public static void main(String[] args) {
		String r1 = AnimalFactory.getInstance("猫咪").shout() ;
		String r2 = AnimalFactory.getInstance("小狗").shout() ;
		System.out.println(r1);
		System.out.println(r2);
	}
}
interface Pet{
	public String shout() ;
}
class Cat implements Pet{

	@Override
	public String shout() {
		return "喵喵喵~" ;
	}
	
}
class Dog implements Pet{

	@Override
	public String shout() {
		// TODO Auto-generated method stub
		return "汪汪汪~" ;
	}
	
}
/***
 * 动物的工厂方法
 * @author Ewonen-PC
 *
 */
class AnimalFactory{
	public static Pet getInstance(String content) { 
		if ( content.contentEquals("猫咪") ) {
			return new Cat() ;
		} else if ( content.contentEquals("小狗") ) {
			return new Dog() ;
		} else {
			return null ;
		}
	}
}