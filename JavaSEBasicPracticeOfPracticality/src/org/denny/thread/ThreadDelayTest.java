package org.denny.thread;
/**
 * 同步方法的使用
 * @author Administrator
 *
 */
class MyThread6 implements Runnable{
	private int ticket = 5 ;
	@Override
	public synchronized void run() {
		for(int a=0;a<100;a++){
			if(this.ticket>0){
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace() ;
				}
				System.err.println("卖票，ticket剩余 ：： => " + ticket --) ;
			} else {
				break ;
			}
		}
	}
	
}
public class ThreadDelayTest{
	public static void main(String[] args) {
		MyThread6 mt = new MyThread6() ;
		Thread t1 = new Thread(mt) ;
		Thread t2 = new Thread(mt) ;
		Thread t3 = new Thread(mt) ;
		t1.start() ;
		t2.start() ;
		t3.start() ;
	}
}
