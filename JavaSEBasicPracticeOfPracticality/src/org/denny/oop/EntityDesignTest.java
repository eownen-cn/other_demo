package org.denny.oop;

/**
 * 1、想好类所需要的属性
 * 2、为每个属性加入private修饰符
 * 3、为每个属性添加访问器(getter/setter)
 * 4、根据情况添加自定义的构造方法
 * 5、添加构造方法后，必须加入默认的无参构造方法
 * @author Administrator	
 *
 */


class Student{
	private String stuno ;
	private String name ;
	private float math ;
	private float english ;
	private float computer ;
	// 如果显示声明了重载的构造方法，则此默认构造必须存在。
	public Student (){}
	// 声明重载构造方法，为属性赋值。
	public Student(String stuno, String name, float math, float english,
			float computer) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	 
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Student [stuno=" + stuno + ", name=" + name + ", math=" + math
				+ ", english=" + english + ", computer=" + computer + "]";
	}
	/**
	 * @return the stuno
	 */
	public String getStuno() {
		return stuno;
	}
	/**
	 * @param stuno the stuno to set
	 */
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the math
	 */
	public float getMath() {
		return math;
	}
	/**
	 * @param math the math to set
	 */
	public void setMath(float math) {
		this.math = math;
	}
	/**
	 * @return the english
	 */
	public float getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(float english) {
		this.english = english;
	}
	/**
	 * @return the computer
	 */
	public float getComputer() {
		return computer;
	}
	/**
	 * @param computer the computer to set
	 */
	public void setComputer(float computer) {
		this.computer = computer;
	}
	
}

public class EntityDesignTest {
	public static void main(String[] args) {
		Student student = new Student("denny-123", "龙永凌", 99.0f, 88.0f, 77.6f) ;
		System.out.println("根据复写的Object类中toStrint()方法后输出:\n\n" + student) ;
		System.out.println();
		System.out.println("手动输出:");
		System.out.println();
		System.out.println("学生编号:" + student.getStuno());
		System.out.println("学生姓名:" + student.getName());
		System.out.println("学生数学:" + student.getMath());
		System.out.println("学生英语:" + student.getEnglish());
		System.out.println("学生电脑:" + student.getComputer());
	}
}
