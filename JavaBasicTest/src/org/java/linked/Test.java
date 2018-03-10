package org.java.linked;

public class Test {
	public static void main(String[] args) {
		Link link = new Link() ;
		link.add(new Person("龙永凌",24));
		link.add(new Person("李兴华",44));
		link.add(new Person("韩顺平",34));
		link.add(new Person("李炎辉",54));
		
		link.print();
		System.out.println(link.contains(new Person("李炎辉",54)));
		
		link.remove(new Person("李炎辉",54));
		System.out.println(link.contains(new Person("李炎辉",54)));
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
		return "姓名:" + this.name + " | 年龄:" + this.age ;
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
class Link{ // 链表的操作类，外部可以直接访问
	private Node root ; // 根
	private int count ; // 记录节点的个数
	private int foot ; // 链表中的伪索引
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
