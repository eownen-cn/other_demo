package org.denny.extend;

class Person{
	private String name ;
	private int age ;
	public Person(){}
	public Person(String name,int age){
		setName(name) ;
		setAge(age) ;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}

class Worker extends Person{
	private double sal ;

	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}

	/**
	 * @param sal the sal to set
	 */
	public void setSal(double sal) {
		this.sal = sal;
	}

	public Worker(double sal) {
		super();
		this.sal = sal;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Worker [sal=" + sal + "]";
	}
	
}
class Student extends Person{
	private String stuno ;
	private String course ;
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
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", course=" + course + "]";
	}
	public Student(String stuno, String course) {
		super();
		this.stuno = stuno;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
}

public class ExtendsTest {
	public static void main(String[] args) {
		Person person1 = new Worker() ;
		Person person2 = new Student() ;
		if(person1 instanceof Worker){
			Worker worker = (Worker)person1 ;
			worker.setName("¡˙”¿¡Ë");
			worker.setAge(22);
			worker.setSal(30000);
			System.err.println("Worker£∫£∫£∫£∫" + worker);
		}
		if(person2 instanceof Student){
			Student student = (Student)person2 ;
			student.setName("¡˙”¿¡Ë");
			student.setAge(22);
			student.setCourse("Java");
			student.setStuno("7D83A");
			System.err.println("Student£∫£∫£∫£∫" + student);
		}
		
		
	}
}
