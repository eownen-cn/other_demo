package org.java.designpattern;
/***
 * ���������ĺ��ľ��ǣ�ԭ��Ϊʵ�����������ʵ���Ĳ������ɹ�����������ɣ������ز���ϸ��
 * @author Ewonen-PC
 *
 */
public class TheDesignPatternOfFactory {
	public static void main(String[] args) {
		String r1 = AnimalFactory.getInstance("è��").shout() ;
		String r2 = AnimalFactory.getInstance("С��").shout() ;
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
		return "������~" ;
	}
	
}
class Dog implements Pet{

	@Override
	public String shout() {
		// TODO Auto-generated method stub
		return "������~" ;
	}
	
}
/***
 * ����Ĺ�������
 * @author Ewonen-PC
 *
 */
class AnimalFactory{
	public static Pet getInstance(String content) { 
		if ( content.contentEquals("è��") ) {
			return new Cat() ;
		} else if ( content.contentEquals("С��") ) {
			return new Dog() ;
		} else {
			return null ;
		}
	}
}