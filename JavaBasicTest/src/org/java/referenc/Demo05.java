package org.java.referenc;

public class Demo05 {
	public static void main(String[] args) {
		Member m = new Member(1,"���˻�") ;
		Member child = new Member(1,"��λ�") ;
		Car c = new Car(1,"���ְ���AK-74") ;
		Car cc = new Car(2,"������M9") ;
		System.out.println(m.getInfo()); // ��ȡ�˵���Ϣ
		System.out.println(c.getInfo()); // ��ȡ������Ϣ
		
		// ���ù�ϵ
		m.setCar(c);
		
		// �󶨳������ӵĹ�ϵ
		child.setCar(cc);
		// �󶨺��Ӹ����Ĺ�ϵ
		cc.setMember(child) ;
		// �󶨸��ӹ�ϵ
		m.setChild(child);
		
		c.setMember(m) ;
		
		// ͨ�����ҵ����ĳ�
		System.out.println(m.getCar().getInfo());

		// ͨ�����ҵ���
		System.out.println(c.getMemeber().getInfo());
		
		// ͨ�����ҵ����˺��ӵĳ�
		System.out.println("����========> " + m.getChild().getInfo());
		System.out.println("���ӵĳ�" + m.getChild().getCar().getInfo());
		
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
		return "���:" + this.mid + " , ����:" + this.name ;
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
		return "���:" + this.carid + " , ����:" + this.name ; 
	}
	
}