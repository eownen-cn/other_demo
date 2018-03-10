package org.java.referenc;

public class Demo05 {
	public static void main(String[] args) {
		Member m = new Member(1,"李兴华") ;
		Member child = new Member(1,"李嘉华") ;
		Car c = new Car(1,"八手奥托AK-74") ;
		Car cc = new Car(2,"法拉利M9") ;
		System.out.println(m.getInfo()); // 获取人的信息
		System.out.println(c.getInfo()); // 获取车的信息
		
		// 设置关系
		m.setCar(c);
		
		// 绑定车跟孩子的关系
		child.setCar(cc);
		// 绑定孩子跟车的关系
		cc.setMember(child) ;
		// 绑定父子关系
		m.setChild(child);
		
		c.setMember(m) ;
		
		// 通过人找到它的车
		System.out.println(m.getCar().getInfo());

		// 通过车找到人
		System.out.println(c.getMemeber().getInfo());
		
		// 通过人找到该人孩子的车
		System.out.println("孩子========> " + m.getChild().getInfo());
		System.out.println("孩子的车" + m.getChild().getCar().getInfo());
		
	}

}
class Member {
	private int mid ;
	private String name ;
	private Car car ;
	private Member child ;
	public void setChild(Member child) {
		this.child = child ;
	}
	public Member getChild() {
		return this.child ;
	}
	public Member(int mid , String name) {
		this.mid = mid ;
		this.name = name ;
	}
	public void setCar(Car car) {
		this.car = car ;
	}
	public Car getCar() {
		return this.car ;
	}
	public String getInfo() {
		return "编号:" + this.mid + " , 姓名:" + this.name ;
	}
}
class Car {
	private int carid ;
	private String name ;
	private Member member ;
	public Car(int carid ,String name) {
		this.carid = carid ;
		this.name = name ;
	}
	public void setMember(Member member) {
		this.member = member ;
	}
	public Member getMemeber(){
		return this.member ;
	}
	public String getInfo() {
		return "编号:" + this.carid + " , 汽车:" + this.name ; 
	}
	
}