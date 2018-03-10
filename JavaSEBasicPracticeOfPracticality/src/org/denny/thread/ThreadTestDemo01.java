package org.denny.thread;
class MyThread extends Thread{
	private String name ;
	public MyThread(String name){
		this.name = name ;
	}
	public void run(){
		for(int a=0;a<10;a++){
			System.err.println(this.name + "运行" + (a+1) + "次！");
		}
	}
}
public class ThreadTestDemo01{
	public static void main(String[] args) {
		Thread thread1 = new MyThread("线程A") ;
		Thread thread2 = new MyThread("线程B") ;
		thread1.run() ;
		System.err.println("===============================") ;
		System.err.println("===============================") ;
		thread2.run() ;
	}
}
