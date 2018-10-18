package com.qa.Animal;

public class Runner {

	public static void main(String[] args) {
	
		
		Mammals m1 = new Mammals("Adonay", 10 , 2);
			
		m1.breath();
		
		Fish f1 = new Fish("Adil", 16 , 0);
	
		f1.swim();

		Birds b1 = new Birds("Naveed", 15 , 90);
			
		b1.fly();
		
		

	}

}
