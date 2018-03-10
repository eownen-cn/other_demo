package org.java.runtime;

class Demo implements Runnable{
	
	private int ticket = 10 ;
	
	public void run() {
		while( ticket > 0 ) {
			synchronized (this) {
				try{
					Thread.sleep(100) ;
					if (this.ticket > 0) {
						System.out.println("当前线程：" + Thread.currentThread().getName() + " -- 卖票  " + this.ticket-- );
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

public class Test03 {
	public static void main(String[] args) {
		Demo d = new Demo() ;
		Thread t1 = new Thread(d,"Process1 ==> ") ;
		Thread t2 = new Thread(d,"Process2 ==> ") ;
		Thread t3 = new Thread(d,"Process3 ==> ") ;
		t1.start() ;
		t2.start() ;
		t3.start() ;
	}
}
