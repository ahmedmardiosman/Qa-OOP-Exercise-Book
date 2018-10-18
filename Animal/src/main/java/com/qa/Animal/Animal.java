package com.qa.Animal;

public abstract class Animal {

	String name;
	
	int age;
	
	
	public Animal(String name, int age) {
		
		this.name=name;
		this.age = age;
		
		
	}
	
	
	
	
	
	public  void eat() {
		
		System.out.println(name +" is eating..." );
		
	}
	
	public void move() {
		
		System.out.println(name +" is moving...");
	}
	
	
	
	
}
