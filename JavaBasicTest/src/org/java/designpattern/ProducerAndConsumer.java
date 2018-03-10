package org.java.designpattern;

/***
 * ��������������
 * @author Ewonen-PC
 *
 */
/**
 * ��Ʒ��
 * @author Ewonen-PC
 *
 */
class Product{
	String name ; 
	public Product(){
		this.name = "����" ;
	}
	public synchronized void set(String name) {
		this.name = name ;
	}
	public synchronized String get(){
		return this.name; 
	}
}
abstract class tools{
	protected int COUNT = 0 ;
	public int size() {
		return this.COUNT ;
	}
}
/**
 * ������
 * @author Ewonen-PC
 *
 */
class Producer extends tools implements Runnable{ // ʵ��Runnable�ӿڣ����߳���ʹ��
	Product product ;
	public Producer(Product product){ // ͨ�����췽������ʵ��
		this.product = product ;
	}
	public void run() {
		for(int a = 0 ; a < 10 ; a ++) {
			try{
				Thread.sleep(2000);
				System.out.println("��ǰ�����ˣ�" + this.COUNT ++ + "������") ;
			} catch (InterruptedException i){
				i.printStackTrace();
			}
		}
	}
}
/**
 * ������
 * @author Ewonen-PC
 *
 */
class Consumer extends tools implements Runnable{
	private Product product ;
	public Consumer(Product product){
		this.product = product ;
	}
	public void run() {
		for(int a = 0 ; a < 10 ; a++){
			try{
				Thread.sleep(2000) ;
				System.out.println("��ǰ������" + this.COUNT ++ + "��" + this.product.get()) ;
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class ProducerAndConsumer {
	public static void main(String[] args) {
		Product p = new Product() ;
		Producer pro = new Producer(p) ;
		Consumer con = new Consumer(p) ;
		new Thread(pro).start();
		new Thread(con).start();
	}
}
