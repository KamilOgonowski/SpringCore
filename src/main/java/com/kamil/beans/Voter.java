package com.kamil.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource("com/kamil/commons/application.properties")
public class Voter {
	
	@Value("${voter.info.name}")
	private String name;
	@Value("${voter.info.age}")
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
	
	public void eligibleToVote() {
		if(age>=18)
			System.out.println("You are eligible to vote!");
		else
			System.out.println("Sorry, you are to young!");
	}
	
	@PreDestroy
	public void testEnd() {
		System.out.println("I'm turning off the light");
	}

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
	
	

}
