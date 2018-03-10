package org.java.runtime;

class RuntimeTest01 extends Thread{
	private String title ;
	public RuntimeTest01(String title){
		this.title = title ;
	}
	public void run() {
		for (int i  = 1 ; i <= 10; i ++) {
			System.out.println(this.title + "执行中-----" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class RuntimeTest02 implements Runnable{
	private String title ;
	public RuntimeTest02(String title){
		this.title = title ;
	}
	public void run() {
		for (int i  = 1 ; i <= 10; i ++) {
			System.out.println(this.title + "执行中-----" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class RuntimeTest03 implements Runnable{
	private String title ;
	public RuntimeTest03(String title){
		this.title = title ;
	}
	public void run() {
		for (int i  = 1 ; i <= 10; i ++) {
			System.out.println(this.title + "执行中-----" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Test02 {
	public static void main(String[] args) {
		
//		new RuntimeTest01("线程1").start();
//		new RuntimeTest01("线程2").start();
//		new RuntimeTest01("线程3").start();
		
		Thread t1 = new Thread(new RuntimeTest03("线程1")) ;
		Thread t2 = new Thread(new RuntimeTest03("线程2")) ;
		Thread t3 = new Thread(new RuntimeTest03("线程3")) ;
		t1.start();
		t2.start();
		t3.start();
		
	}
}
