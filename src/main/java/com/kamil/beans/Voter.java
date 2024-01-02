package com.kamil.beans;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Voter {
	
	private String name;
	private int age;
	
	static {
		System.out.println("Loading of Voter class!");
	}
	

	public Voter() {
		System.out.println("Voter bean has been created");
	}
	
	@PostConstruct
	public void test() {
		System.out.println("I am executing test method, without being called");
	}
	
	@PreDestroy
	public void testEnd() {
		System.out.println("I'm turning off the light");
	}
	
	

}
