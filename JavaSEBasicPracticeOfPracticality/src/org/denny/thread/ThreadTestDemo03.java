package org.denny.thread;
/**
 * 卖票案例
 * 通过以下案例中可以发现，每个线程都各自操作自己的ticket。
 * 并不能完成有序资源共享，说明此案例并不符合实际应用。
 * @author Administrator
 *
 */
class MyThread3 extends Thread{
	private int ticket = 5 ;
	@Override
	public void run() {
		for(int a=0;a<100;a++){
			if(this.ticket>0){
				System.err.println("卖票，ticket剩余 ：： => " + ticket --) ;
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
