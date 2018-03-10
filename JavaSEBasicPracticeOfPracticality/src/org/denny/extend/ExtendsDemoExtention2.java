package org.denny.extend;
/**
 * ¼Ì³ÐÖÐ£¬ÊôÐÔµÄ¸²¸Ç
 * @author Administrator
 *
 */
class People2{
	protected String info = "Hello" ;
	public void print(){
		System.err.print(info) ;
	}
}
class Clerk2 extends People2{
	String info = "World" ;
	public void print() {
		System.err.print(this.info) ;
	}
}


public class ExtendsDemoExtention2 {
	public static void main(String[] args) {
		new People2().print() ;
		new Clerk2().print() ;
	}
}
