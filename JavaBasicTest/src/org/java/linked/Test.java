package org.java.linked;

public class Test {
	public static void main(String[] args) {
		Link link = new Link() ;
		link.add(new Person("������",24));
		link.add(new Person("���˻�",44));
		link.add(new Person("��˳ƽ",34));
		link.add(new Person("���׻�",54));
		
		link.print();
		System.out.println(link.contains(new Person("���׻�",54)));
		
		link.remove(new Person("���׻�",54));
		System.out.println(link.contains(new Person("���׻�",54)));
		link.print();
		
	}
}
class Person{
	private String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age ;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "����:" + this.name + " | ����:" + this.age ;
	}
	public boolean equals(Person per) {
		if ( this == per ) {
			return true ;
		}
		if ( per == null ) {
			return false ;
		}
		if ( per.getAge() == this.age && this.getName().contentEquals(this.name) ) {
			return true ;
		}
		return false ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
class Link{ // ����Ĳ����࣬�ⲿ����ֱ�ӷ���
	private Node root ; // ��
	private int count ; // ��¼�ڵ�ĸ���
	private int foot ; // �����е�α����
	private Object[] retArray;
	private class Node{ // ����ڵ��ڲ��࣬����ֻ������Link�н��в�������
		private Object data ; // �ڵ�����
		private Node next ; // ��ǰ�ڵ����һ���ڵ�
		public Node(Object data){
			this.data = data ;
		}
		public void add(Node newNode) {
			if (this.next == null) {
				this.next = newNode ;
			} else {
				this.next.add(newNode) ;
			}
		}
		public void print() {
			System.out.println("<-- " + this.data + " -->");
			if ( this.next != null ) {
				this.next.print();
			}
		}
		public boolean contains(Object data) {
			// ���ж��Ƿ���ڣ������ǰֵ��ƥ���ֱ�ӷ���true
			if( data.equals(this.data) ) { // this.data = root.data
				return true ;
			} else { // �����������һ���ڵ㣬��������²���
				if ( this.next != null ) {
					return this.next.contains(data) ;
				} 
			}
			return false;
		}
		public Object get(int foot) {
			if (Link.this.foot ++ == foot) {
				return this.data ;
			} else {
				return this.next.get(foot) ;
			}
			
		}
		public void set(int index, Object data) {
			if (Link.this.foot ++ == index) { // �ҵ��ˣ��͸�
				this.data = data;
			} else {
				this.next.set(index, data); // ��֮����������
			}
		}
		public void remove(Node pre, Object data) {
			// TODO Auto-generated method stub
			if (this.data.equals(data)) {
				pre.next = this.next ;
			} else {
				if (this.next != null) {
					this.next.remove(this, data);
				}
			}
		}
		public void toArrayNode() {
			Link.this.retArray[ Link.this.foot ++ ] = this.data ;
			if ( this.next != null ) {
				this.next.toArrayNode();
			}
		}
	}
	
	public void add(Object data){
		if( data == null ) { // ������nullֵ����
			return ;
		}
		Node newNode = new Node(data) ;
		if ( this.root == null ) {
			this.root = newNode ;
		} else {
			this.root.add(newNode) ;
		}
		this.count ++ ;
	}
	public void print(){
		if( this.root != null ){
			this.root.print() ;
		}
	}
	public int size(){
		return this.count ;
	}
	public boolean isEmpty(){
		return this.count == 0 ;
	}
	public boolean contains(Object data) {
		if ( this.root == null || data == null ) { // �ų�û�б�Ҫ��ѯ�����
			return false ; 
		} else {
			return this.root.contains(data) ; // ��ʾ���ڵ������ݣ���ô�����ڵ��Լ�����
		}
	}
	public Object get(int index){
		this.foot = 0 ; // �����������������ģ��������ָ����ѯ�Ŀ�ʼ�����0
		if ( index > this.count ) {
			return null ;
		}
		return this.root.get(index) ;
	}
	public void set(int index , Object data) {
		this.foot = 0 ; // ��ʼ���Ǳ�
		if ( index > this.count ) {
			return ;  // �޷��޸Ĳ����ڵ�����
		} else {
			this.root.set(index,data) ;
		}
	}
	public void remove(Object data) {
		if ( this.root != null && this.root.data.equals(data) ) { 
			this.root = this.root.next ;
		} else {
			this.root.next.remove(this.root,data) ;
		}
		this.count -- ; // ɾһ��count������һ��
	}
	public Object[] toArray(){
		if ( this.root == null ) {
			return null ;
		}
		this.foot = 0 ;
		this.retArray = new Object[this.count];
		this.root.toArrayNode() ;
		return this.retArray ;
	}
}
