package org.denny.string;

/**
 * 
 * �ܽ�:
 * 	1��String Ҫʹ��ֱ�Ӹ�ֵ�ķ�ʽ����Ϊʹ��new�ķ�ʽ�Ὺ�������ռ䣬����ڴ��˷ѡ�
 *  2��һ���ַ�������һ��������String����
 *  3���ַ����ıȽ������ַ�ʽ: == �� equals 
 * 
 */


/**
 * String ��ʼ���ķ�ʽ
 * @author Administrator
 *
 */
class InstanceStringClassDemo1{
	String name1 = "������" ;
	String name2 = new String("������") ;
}
/**
 * �Ƚ�����������������
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
 * ʹ��==�Ƚ�name 1��2��3��������
 * @author Administrator
 *
 */
class LocationValueEqualsTest{
	String name1 = "������" ;
	String name2 = new String ("������") ;
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
		System.err.println("��name1������ָ���µ�����ʱ,��ôname1֮ǰ��ָ���ֵ�������٣�����˵ָ�뱻������:") ;
		name1 = name3 ;
		System.err.println("��name3�����ý���name1��:"
				+ "\nname1 = " + name1) ;
		System.err.println("name1 == name3�����Ƚ�:::::" + (name1 == name3));
		System.err.println("name1 equals name3�����Ƚ�:::::" + (name1 .equals(name3)));
	}
}

public class StringImportentTest {
	public static void main(String[] args) {
		InstanceStringClassDemo1 string = new InstanceStringClassDemo1() ;
		
		System.err.println("����1��" + string.name1);
		System.err.println("����2��" + string.name2);
		
		System.err.println("�������ֵıȽϽ��:" + new BisicDataTypeTest().equals());
		
		System.err.println("ʹ��==�Ƚ�name 1��2��3��������:");
		
		LocationValueEqualsTest test = new LocationValueEqualsTest() ;
		System.err.println("name1 == name2::::" + (test.name1 == test.name2)) ;
		System.err.println("name2 == name3::::" + (test.name2 == test.name3)) ;
		System.err.println("name1 == name3::::" + (test.name1 == test.name3)) ;
		
		System.err.println("ʹ��equals�Ƚ�name 1��2��3��������:") ;
		System.err.println("name1 equals name2::::" + (test.name1.equals(test.name2))) ;
		System.err.println("name2 equals name3::::" + (test.name2.equals(test.name3))) ;
		System.err.println("name1 equals name3::::" + (test.name1.equals(test.name3))) ;
		
		System.err.println("����һ���ַ���,����ַ������ܹ�ֱ�ӵ���String���еķ�������ô˵��������һ��������String����:");
		System.err.println("hello" .equals(new PseudonymObjectTest().name)) ;
		System.err.println("HELLO" .equalsIgnoreCase(new PseudonymObjectTest().name)) ;
		
		// �ַ���������һ���������򲻿ɸı�
		new InflexibleStringTest().iflexibleTest() ;
		
	}
}
