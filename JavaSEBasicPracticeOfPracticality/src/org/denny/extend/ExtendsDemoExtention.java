package org.denny.extend;

class People{
	protected void print(){
		System.out.println("Person>>>>>public void println()");
	}
	public void fun(){
		this.print();
	}
}
class Clerk extends People{
	@Override
	public void print(){
		super.print() ;
//		System.out.println("��д�����е�print()����");
	}
}


public class ExtendsDemoExtention {
	public static void main(String[] args) {
//		People people = new People() ;
//		people.print();
		Clerk clerk = new Clerk() ;
		clerk.print();
	}
}
