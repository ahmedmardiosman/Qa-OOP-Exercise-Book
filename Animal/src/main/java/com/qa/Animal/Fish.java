package com.qa.Animal;

public class Fish extends Animal {
	
	int numberOfFins;

	public Fish(String name, int age, int numberOfFins) {
		super(name, age);
		this.numberOfFins = numberOfFins;
		
	}
	
	public void swim() {
		
		System.out.println(name + " is a fish which is " + age + " years old and can swim and also has "
				+ numberOfFins + " fins!!");
	}
	
	
	

}
