package org.java.designpattern;

public class TheDesignPatternOfProxy {
	public static void main(String[] args) {
		new ProxySubject(new DoSubject()).run(); // ʹ�ô������Դ�����������ʵ����Ĳ�������
	}
}
interface Subject{ // ���������⡢ҵ�񡢡���
	public void run() ;
}
class DoSubject implements Subject{

	@Override
	public void run() {
		System.err.println("The run function is running ...");
	}
	
}
class ProxySubject implements Subject{

	private Subject subject ;
	public ProxySubject(Subject subject){
		this.subject = subject ;
	}
	@Override
	public void run() {
		this.before();
		this.subject.run();
		this.after();
	}
	
	public void before(){
		System.err.println("Before the run function running.");
	}
	
	public void after(){
		System.err.println("After the run function running.");
	}
	
}
