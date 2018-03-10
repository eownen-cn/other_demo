package org.denny.oop;
/**
 * Java OOP-封装性测试
 * 
 * 结论:	类中的所有成员和方法默认都是以default修饰符修饰，该修饰符 default指定
 * 该类中被修饰的成员允许被同一个包下的所有其它类直接访问。
 * 		为了让程序个体化，自己的私有属性只能有自身访问和控制，private修饰符可以为类中的属性
 * 增加不可被外部类访问的权限，因此在外部类想要访问本类私有属性时，由该public String getXxx()
 * 方法决定返回的内容。至此，实现了数据的个体化，即封装。 	
 * 
 * @author Administrator
 *
 */

/**
 * person 类
 * @author Administrator
 *
 */
class Person{
	String name ;
	int age ;
	void print(){
		System.err.println("姓名:" + name + "、年龄:" + age) ;
	}
}

class Person2{
	private String name ;
	private int age ;
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public int getAge(){
		return this.age ;
	}
	
	void print(){
		System.err.println("姓名:" + getName() + "、年龄:" + getAge()) ;
	}
}
public class EncapsulationTest {
	public static void main(String[] args) {
		Person person = new Person() ;
		person.name = "龙永凌" ;					
		person.age = 22 ;
		person.print();
		
		Person2 person2 = new Person2() ;
		person2.setName("龙永凌");
		person2.setAge(22); 
		person2.print();
	}
}
