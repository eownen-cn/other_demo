package org.denny.string;

/**
 * ����:����顢��̬����顢���췽���飬��ʵ����ʱǰ���ִ��˳��
 * �ܽ�:
 * 1�����ǵ�ִ��˳�� ��������.
 * 2��ʵ��֤��:��̬��������������еĹ���������������������ڹ��췽���顣
 * 3����̬�����ִֻ��һ�Σ������ʵ�����޹ء�
 * @author Administrator
 *
 */

class Demo01{
	static {
		System.err.println("This is static code block��") ;
	}
	{
		System.err.println("This is construct code block��");
	}
	public Demo01(){
		System.err.println("This is constructor code block��");
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
		new Demo01("This is contains prameters constructor code block��") ;
		System.err.println() ;
		new Demo01("This is contains prameters constructor code block��") ;
	}
}
