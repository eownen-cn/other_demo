package org.java.oop;
/**
 * ����Ԫ����Ŀ�꣺
 * 1���˽�Java����Ļ���������ʽ���Լ��������Ļ�������
 * 2���˽��������Ļ�����ϵ��
 * 3���࣬��������������������һ�ֳ���ĸ��
 * ��������ͨ��һ��������ɴ����ģ�
 * �����Ҳ������һ����Ʒ������ģ��,
 * û��ʵ�����Ķ�������ǲ��ܲ������еķ��������Եġ�
 * @author Ewonen-PC
 *
 */
public class ObjectInstanceTest {
	public static void main(String[] args) {
		Book bk = null ;
		bk = new Book("��¥��",99.8) ; // ���󴴽������ʵ����֮�����ʹ�������ԣ������׳�NullPointerException
		String info = bk.getInfo();
		System.out.println(info) ;
	}
}
