package org.denny.thread;
/**
 * ��Ʊ����
 * ͨ�����°����п��Է��֣�ÿ���̶߳����Բ����Լ���ticket��
 * ���������������Դ����˵���˰�����������ʵ��Ӧ�á�
 * @author Administrator
 *
 */
class MyThread3 extends Thread{
	private int ticket = 5 ;
	@Override
	public void run() {
		for(int a=0;a<100;a++){
			if(this.ticket>0){
				System.err.println("��Ʊ��ticketʣ�� ���� => " + ticket --) ;
			} else {
				break ;
			}
		}
	}
	
}
public class ThreadTestDemo03{
	public static void main(String[] args) {
		MyThread3 a = new MyThread3() ;
		MyThread3 b = new MyThread3() ;
		MyThread3 c = new MyThread3() ;
		a.start();
		b.start();
		c.start();
	}
}
