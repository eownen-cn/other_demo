package org.java.staticdemo;

class Demo01{
	/***
	 * 1����̬���Ժͷ�����ȫ�ֵģ����õģ����Բ�ͨ�����ʵ��ֱ��ʹ������.����������
	 * 2����̬�����У�������ʹ�����зǾ�̬���ԣ���֮����ͨ��������ʹ�������κ�����
	 * 3����̬�����Ի򷽷�������ʹ��this���ã����붼����ͨ��
	 * 4����̬�࣬��û������Ӧ��Ҳû����
	 */
	static String data = "hello world !!!" ;
	private String name ;
	private String habby ;
	public Demo01(String name , String habby) {
		this.name = name ;
		this.habby = habby ;
	}
	public String getInfo(){
		return "����:" + this.name + " | ����:" + this.habby + " | ����:" + Demo01.data ;
	}
}

public class StaticTest1 {
	public static void main(String args[]) {
		Demo01 d1 = new Demo01("������","�ô���") ;
		Demo01 d2 = new Demo01("����","��Ƭ") ;
		Demo01.data = "��ã����磡����" ;
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		Demo01.data = "���������ܺã�" ;
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		Demo01.data = "���������ܲ���" ;
		System.out.println(d2.getInfo());
	}
}
