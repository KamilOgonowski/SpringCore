package com.kamil.beans;

import org.springframework.stereotype.Component;

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
	
	

}
