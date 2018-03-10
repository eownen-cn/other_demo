package org.java.petshop;
class Link{ // ����Ĳ����࣬�ⲿ����ֱ�ӷ���
	private Node root ; // ��
	private int count ; // ��¼�ڵ�ĸ���
	private int foot ; // ��̬����������ṹת����ṹ������
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
interface Pet{
	public String getName() ;
	public int getAge() ;
}
class PetShop{
	private Link pets = new Link(); // ������������Ϣ
	public void add(Pet pet) { // �����ϼ�
		this.pets.add(pet) ;
	}
	public void delete(Pet pet){ // �����¼�
		this.pets.remove(pet) ;
	}
	public Link search(String keyword){ // ģ����ѯ
		
		Link result = new Link() ;
		Object[] obj = this.pets.toArray() ;
		for( int a = 0 ; a < obj.length ; a ++ ) {
			Pet pet = (Pet) obj[a] ;
			if ( pet.getName().contains(keyword) ) {
				result.add(pet);
			}
		}
		return result ;
	}
	public Object[] getAll() {
		return this.pets.toArray() ;
	}
	public int size() {
		return pets.size() ;
	}
}
class Cat implements Pet{

	private String name ;
	private int age ;
	public Cat(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	@Override
	public String getName() {
		return this.name ;
	}

	@Override
	public int getAge() {
		return this.age ;
	}
	public String toString(){
		return "è������:" + this.name + " | ��������:" + this.age ; 
	}
	public boolean equals(Object obj) { // ����Ƚ�
		if ( this == obj ) {
			return true ;
		}
		if ( obj == null ) {
			 return false ;
		}
		if ( !(obj instanceof Cat)) {
			return false ;
		}
		Cat c = (Cat) obj ;
		if ( this.getName().contentEquals(c.getName())
				&& this.getAge() == c.getAge() ) {
			return true ;
		}
		return false ;
	}
}
class Dog implements Pet{

	private String name ;
	private int age ;
	public Dog(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	@Override
	public String getName() {
		return this.name ;
	}

	@Override
	public int getAge() {
		return this.age ;
	}
	public String toString(){
		return "��������:" + this.name + " | ��������:" + this.age ; 
	}
	public boolean equals(Object obj) { // ����Ƚ�
		if ( this == obj ) {
			return true ;
		}
		if ( obj == null ) {
			 return false ;
		}
		if ( !(obj instanceof Dog)) {
			return false ;
		}
		Dog c = (Dog) obj ;
		if ( this.getName().contentEquals(c.getName())
				&& this.getAge() == c.getAge() ) {
			return true ;
		}
		return false ;
	}
}

public class TestDemo {
	public static void main(String[] args) {
		PetShop ps = new PetShop() ;
		ps.add(new Cat("��è",5)); // �ϼ�һֻ
		ps.add(new Cat("��è",2)); // �ϼ�һֻ
		ps.add(new Cat("��è",3)); // �ϼ�һֻ
		ps.add(new Dog("����",1)); // �ϼ�һֻ
		ps.add(new Dog("����",4)); // �ϼ�һֻ
		ps.add(new Dog("�׹�",7)); // �ϼ�һֻ
		ps.delete(new Dog("����",1)); // �¼�һֻ
		Object[] o = ps.search("��").toArray() ; // ģ����ѯ������ѯ�Ľ��תΪ���鱣��
		for(Object pet : o) { // ����
			System.out.println(pet); // ʵ���าд��toString()
		}
		System.out.println("----------------------------------------------------");
		// ����
		int count = ps.size() ;
		System.out.println("�̵������г���ĸ���:" + count);
		System.out.println("----------------------------------------------------");
		// ��ѯ������Ϣ
		o = ps.getAll() ;
		for(Object pet : o) { // ����
			System.out.println(pet); // ʵ���าд��toString()
		}
		System.out.println("----------------------------------------------------");
	}
}
