package com.qa.Animal;

public class Mammals extends Animal {

	int numberOfLegs;

	public Mammals(String name, int age, int numberOfLegs) {
		super(name, age);
		this.numberOfLegs = numberOfLegs;
	}

	public void breath() {
		System.out.println(name + " is a mammal which is " + age + " years old and can breath and also has "
				+ numberOfLegs + " legs!!");
	}

}
