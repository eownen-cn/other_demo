package org.denny.thread;

class MyThread2 implements Runnable{
	private String name ;
	public MyThread2(){}
	public MyThread2(String name){
		this.name = name ;
	}
	@Override
	public void run() {
		for(int a=0;a<10;a++){
			System.err.println(name + "线程运行" + a + "次！") ;
		}
	}
	
}
public class ThreadTestDemo02{
	public static void main(String[] args) {
		MyThread2 t21 = new MyThread2("A") ;
		MyThread2 t22 = new MyThread2("B") ;
		Thread t1 = new Thread(t21) ;
		Thread t2 = new Thread(t22) ;
		t1.start();
		System.err.println("+++++++++++++++++++++++++++++++++") ;
		t2.start();
	}
}
