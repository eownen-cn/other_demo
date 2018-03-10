package org.denny.oop;

/**
 * 1�����������Ҫ������
 * 2��Ϊÿ�����Լ���private���η�
 * 3��Ϊÿ��������ӷ�����(getter/setter)
 * 4�������������Զ���Ĺ��췽��
 * 5����ӹ��췽���󣬱������Ĭ�ϵ��޲ι��췽��
 * @author Administrator	
 *
 */


class Student{
	private String stuno ;
	private String name ;
	private float math ;
	private float english ;
	private float computer ;
	// �����ʾ���������صĹ��췽�������Ĭ�Ϲ��������ڡ�
	public Student (){}
	// �������ع��췽����Ϊ���Ը�ֵ��
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
		Student student = new Student("denny-123", "������", 99.0f, 88.0f, 77.6f) ;
		System.out.println("���ݸ�д��Object����toStrint()���������:\n\n" + student) ;
		System.out.println();
		System.out.println("�ֶ����:");
		System.out.println();
		System.out.println("ѧ�����:" + student.getStuno());
		System.out.println("ѧ������:" + student.getName());
		System.out.println("ѧ����ѧ:" + student.getMath());
		System.out.println("ѧ��Ӣ��:" + student.getEnglish());
		System.out.println("ѧ������:" + student.getComputer());
	}
}
