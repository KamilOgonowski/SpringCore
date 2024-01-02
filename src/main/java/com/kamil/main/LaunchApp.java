package com.kamil.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kamil.beans.Voter;

public class LaunchApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCOntext.xml");
		
		Voter voter = context.getBean(Voter.class);
		voter.eligibleToVote();
//		System.out.println(voter.getAge());
		context.close();
		
		

	}

}
