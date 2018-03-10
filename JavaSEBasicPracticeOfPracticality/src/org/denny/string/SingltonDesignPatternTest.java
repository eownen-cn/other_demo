package org.denny.string;

import org.denny.util.HuMan;
/**
 * The design pattern practicality of Singleton .
 * @author Administrator
 *
 */
class User{
	private static User instance = getUserInstance() ;
	static {
		instance = instance == null ? new User() : instance ;
	}
	public static User getUserInstance(){
		return instance ;
	}
	private User(){}
	
	private String name ;
	private HuMan people;
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
	 * @return the people
	 */
	public HuMan getPeople() {
		return people;
	}
	/**
	 * @param people the people to set
	 */
	public void setPeople(HuMan people) {
		this.people = people;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", people=" + people + "]";
	}
	
}

public class SingltonDesignPatternTest {
	public static void main(String[] args) {
		User user = User.getUserInstance() ;
		user.setName("¡˙”¿¡Ë");
		user.setPeople(HuMan.GENTLMEN);
		System.err.println(user);
	}
}
