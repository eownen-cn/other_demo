package org.denny.thread;
/**
 * ͬ��������ʹ��
 * @author Administrator
 *
 */
class MyThread5 implements Runnable{
	private int ticket = 5 ;
	@Override
	public void run() {
		for(int a=0;a<100;a++){
			synchronized (this){
				if(this.ticket>0){
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace() ;
					}
					System.err.println("��Ʊ��ticketʣ�� ���� => " + ticket --) ;
				} else {
					break ;
				}
			}
		}
	}
	
}
public class ThreadDelayTest2{
	public static void main(String[] args) {
		MyThread5 mt = new MyThread5() ;
		Thread t1 = new Thread(mt) ;
		Thread t2 = new Thread(mt) ;
		Thread t3 = new Thread(mt) ;
		t1.start() ;
		t2.start() ;
		t3.start() ;
	}
}
