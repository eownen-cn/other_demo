package org.denny.thread;
/**
 * ͬ������Ʊ
 * ͨ�����°����п��Է��֣�����ÿ���߳�����������ͬһ��Runnable��ʵ��
 * �ʣ�˵���̱߳�ͬ���ˣ��ﵽ����Դ�����Ŀ�ġ�
 * 
 * ����:
 * 		1��Thread����Runnable�����࣬ʹ���˴���Ļ�����ɡ�
 * 		2�����߳��е���start()�ķ�������Ҫͨ��CPU���ȣ���������ʵ�ʵ��õ���Ȼ��Runnable�ӿڵ�run()����
 * 		3�����̲߳�����ʹ���У�ѡ��ʵ��Runnable���ڼ̳�Thread����Ϊ����Ը��ߡ�
 * 
 * @author Administrator
 *
 */
class MyThread4 implements Runnable{
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
public class ThreadTestDemo04{
	public static void main(String[] args) {
		MyThread4 mt = new MyThread4() ;
		new Thread(mt).run() ;
		new Thread(mt).run();
		new Thread(mt).run() ;
	}
}
