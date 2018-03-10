package org.denny.linked;

class Link{
	class Node{
		private String data ;
		private Node next ;
		public Node(String data){
			this.data = data ;
		}
		public void add(Node newNode) {
			if(this.next == null){
				this.next = newNode ;
			} else {
				this.next.add(newNode);
			}
		}
		public void print() {
			System.err.print(this.data + "、") ;	
			if(this.next != null){
				this.next.print();
			}
		}
		
		public boolean search(String data){
			if(this.data.equals(data)){
				return true ;
			} else {
				if(this.next != null){
					return this.next.search(data) ;
				} else {
					return false ;
				}
			}
		}
		public boolean delete(Node previous, String data) {
			if(data.equals(this.data)){
				previous.next = this.next ;
				return true ;
			} else {
				if(this.next != null){
					return this.next.delete(this, data);
				} else {
					return false ;
				}
			}
		}
		
	}
	private Node root ; 		// 根节点
	public void addNode(String data){
		Node newNode = new Node(data) ;
		if(this.root == null){
			this.root = newNode ;
		} else {
			this.root.add(newNode) ;
		}
	}
	
	public void printNode(){
		if(this.root != null){
			this.root.print() ;
		}
	}
	
	public boolean contains(String name){
		return this.root.search(name) ;
	}
	
	public boolean deleteNode(String data){
		if(this.contains(data)){
			if(this.root.data.equals(data)){
				this.root = this.root.next ;
				return true ;
			} else {
				return this.root.next.delete(root,data) ;
			}
		} else {
			return false ;
		}
	}
	
}



public class UnidirectionalLinkedTest {
	public static void main(String[] args) {
		Link link = new Link() ;
		link.addNode("A");
		link.addNode("B");
		link.addNode("C");
		link.addNode("D");
		link.addNode("E");
		link.addNode("F");
		link.addNode("G");
		link.printNode();
		System.err.println();
		System.err.println("查询找C :: " + link.contains("C"));
		System.err.println();
		System.err.println("删除D :: " + link.deleteNode("D"));
		link.printNode();
		
	}
	
}
