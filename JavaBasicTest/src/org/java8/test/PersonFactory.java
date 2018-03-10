package org.java8.test;

public interface PersonFactory<P extends Person>{
	P create(String firstName , String lastName) ;
}
