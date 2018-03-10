package org.denny.thread;
/**
 * 同步代码块的使用
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
					System.err.println("卖票，ticket剩余 ：： => " + ticket --) ;
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
