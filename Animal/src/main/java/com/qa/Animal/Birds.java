package com.qa.Animal;

public class Birds extends Animal{
	
	int numberOfWings;
	
	
	public Birds(String name, int age, int numberOfWings) {
		super(name, age);
		this.numberOfWings = numberOfWings;
	
	}

	
	public void fly() {
		
		System.out.println(name + " is a bird which is " + age + " years old and can fly and also has "
				+ numberOfWings + " wings!!");
		eat();
	}
	
	
	
	
	
	
	
	

}
