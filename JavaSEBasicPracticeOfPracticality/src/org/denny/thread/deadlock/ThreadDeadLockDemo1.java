package org.denny.thread.deadlock;

class Denny{
	public void sayToScott(){
		System.err.println("Denny:���Ǯ���ң��ҾͰ������㣡") ;
	}
	public void obtain(){
		System.err.println("���:����õ���˹���ص�Ǯ��");
	}
}
class Scott{
	public void sayToDenny(){
		System.err.println("Scott:��������ң��ҾͰ�Ǯ���㣡") ;
	}
	public void obtain(){
		System.err.println("���:˹���صõ��˵��������");
	}
}
class BusinessDeal implements Runnable{
	private static Denny denny = new Denny() ;
	private static Scott scott = new Scott() ;
	public boolean flag = false ; 					// ����һ����־λ����˭��˵����
	@Override
	public void run() {
		if(flag){
			denny.sayToScott();
			try {
				Thread.sleep(1000) ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(denny){
				denny.obtain();
			}
		} else {
			scott.sayToDenny();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(scott){
				scott.obtain();
			}
		}
	}
	
}
public class ThreadDeadLockDemo1 {
	public static void main(String[] args) {
		BusinessDeal bd1 = new BusinessDeal() ;
		BusinessDeal bd2 = new BusinessDeal() ;
		
		bd1.flag = true ;
		bd2.flag = true ;
		
		Thread t1 = new Thread(bd1) ;
		Thread t2 = new Thread(bd2) ;
		
		t1.start();
		t2.start();
		
	}
}
