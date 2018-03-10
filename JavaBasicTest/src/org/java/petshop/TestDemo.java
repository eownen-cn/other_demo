package org.java.petshop;
class Link{ // 链表的操作类，外部可以直接访问
	private Node root ; // 根
	private int count ; // 记录节点的个数
	private int foot ; // 动态索引，链表结构转数组结构的桥梁
	private Object[] retArray;
	private class Node{ // 定义节点内部类，该类只允许在Link中进行操作访问
		private Object data ; // 节点数据
		private Node next ; // 当前节点的下一个节点
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
			// 先判断是否存在，如果当前值就匹配就直接返回true
			if( data.equals(this.data) ) { // this.data = root.data
				return true ;
			} else { // 否则如果有下一个节点，则继续往下查找
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
			if (Link.this.foot ++ == index) { // 找到了，就改
				this.data = data;
			} else {
				this.next.set(index, data); // 反之，继续往下
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
		if( data == null ) { // 不保存null值数据
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
		if ( this.root == null || data == null ) { // 排除没有必要查询的情况
			return false ; 
		} else {
			return this.root.contains(data) ; // 表示根节点有数据，那么交给节点自己处理
		}
	}
	public Object get(int index){
		this.foot = 0 ; // 由于链表本身就是无序的，因此这里指定查询的开始必须从0
		if ( index > this.count ) {
			return null ;
		}
		return this.root.get(index) ;
	}
	public void set(int index , Object data) {
		this.foot = 0 ; // 初始化角标
		if ( index > this.count ) {
			return ;  // 无法修改不存在的数据
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
		this.count -- ; // 删一个count必须少一个
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
	private Link pets = new Link(); // 保存多个宠物信息
	public void add(Pet pet) { // 宠物上架
		this.pets.add(pet) ;
	}
	public void delete(Pet pet){ // 宠物下架
		this.pets.remove(pet) ;
	}
	public Link search(String keyword){ // 模糊查询
		
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
		return "猫的名字:" + this.name + " | 宠物年龄:" + this.age ; 
	}
	public boolean equals(Object obj) { // 对象比较
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
		return "狗的名字:" + this.name + " | 宠物年龄:" + this.age ; 
	}
	public boolean equals(Object obj) { // 对象比较
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
		ps.add(new Cat("王猫",5)); // 上架一只
		ps.add(new Cat("惊猫",2)); // 上架一只
		ps.add(new Cat("雷猫",3)); // 上架一只
		ps.add(new Dog("王狗",1)); // 上架一只
		ps.add(new Dog("惊狗",4)); // 上架一只
		ps.add(new Dog("雷狗",7)); // 上架一只
		ps.delete(new Dog("王狗",1)); // 下架一只
		Object[] o = ps.search("惊").toArray() ; // 模糊查询并将查询的结果转为数组保存
		for(Object pet : o) { // 遍历
			System.out.println(pet); // 实体类覆写了toString()
		}
		System.out.println("----------------------------------------------------");
		// 总数
		int count = ps.size() ;
		System.out.println("商店里所有宠物的个数:" + count);
		System.out.println("----------------------------------------------------");
		// 查询所有信息
		o = ps.getAll() ;
		for(Object pet : o) { // 遍历
			System.out.println(pet); // 实体类覆写了toString()
		}
		System.out.println("----------------------------------------------------");
	}
}
