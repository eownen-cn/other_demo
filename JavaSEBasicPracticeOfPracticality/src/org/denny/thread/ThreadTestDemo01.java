package org.denny.thread;
class MyThread extends Thread{
	private String name ;
	public MyThread(String name){
		this.name = name ;
	}
	public void run(){
		for(int a=0;a<10;a++){
			System.err.println(this.name + "����" + (a+1) + "�Σ�");
		}
	}
}
public class ThreadTestDemo01{
	public static void main(String[] args) {
		Thread thread1 = new MyThread("�߳�A") ;
		Thread thread2 = new MyThread("�߳�B") ;
		thread1.run() ;
		System.err.println("===============================") ;
		System.err.println("===============================") ;
		thread2.run() ;
	}
}
