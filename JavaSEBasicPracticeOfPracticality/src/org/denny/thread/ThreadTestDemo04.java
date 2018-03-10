package org.denny.thread;
/**
 * 同样是卖票
 * 通过以下案例中可以发现，由于每个线程所操作的是同一个Runnable的实例
 * 故，说明线程被同步了，达到了资源共享的目的。
 * 
 * 结论:
 * 		1、Thread类是Runnable的子类，使用了代理的机制完成。
 * 		2、在线程中调用start()的方法，需要通过CPU调度，而后最终实际调用的仍然是Runnable接口的run()方法
 * 		3、在线程操作的使用中，选择实现Runnable优于继承Thread，因为灵活性更高。
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
				System.err.println("卖票，ticket剩余 ：： => " + ticket --) ;
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
