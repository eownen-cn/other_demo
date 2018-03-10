package org.denny.abstractclass;

/***
 * ���Ǽ̳��У��漰����һ�������ڵ���ģʽ��Ӧ�ó���
 * ��ͬ���ǣ����µİ���Ҳ��ʾ��ʹ��final���������һ�ֱ�����ʽ
 * �������룬final���������࣬�����°���ֻ������һ������
 * �ð����� ��Ͼ�̬�����������ࡢ�ڲ��ࡢ��̬�ࡢ��װ�Ͷ�̬�ľ����һ��ʵ��
 * @author Ewonen-PC
 *
 */
public class Test {
	public static void main(String[] args) {
		Outer.getInstance().print();
	}
}
abstract class Outer{
	public abstract void print() ;
	
	// ���µ�private��ʾOuter����ֻ��Inner��һ������ʱ��Ӧ�ó���
	// Ŀ�ľ���Ϊ�û����ز���Ҫ�����࣬ ��ͬʱ�ⲿ��Ȼ����ͨ����̬����getInstance()�õ����ڲ����ʵ��
	private static class Inner extends Outer{ 

		public void print() { // ��дOuter�еķ���
			System.out.println("Hello world !!!");
		}
		
	}
	static Outer getInstance(){ // �����ڲ������� 
		return new Inner() ;
	}
}
