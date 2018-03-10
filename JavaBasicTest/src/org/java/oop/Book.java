package org.java.oop;

public class Book {
	private String title ; 
	private double price ;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInfo(){
		return "����:" + this.title + "\n�۸�" + this.price ;
	}
	public Book(String title,double price) {
		this.title = title ;
		this.price = price ;
	}
}
