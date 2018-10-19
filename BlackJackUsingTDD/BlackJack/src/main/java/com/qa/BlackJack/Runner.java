package com.qa.BlackJack;

public class Runner {

	public static void main(String[] args) {

		int integer1 = 19;

		int integer2 = 18;

		BlackJack firstGame = new BlackJack(integer1, integer2);

		System.out.println( "- If player one and two's card is greater than 21, then the system will return 0" );
		System.out.println("- If player one and two's card are both less than or equal to 21, then it will return the players card with the highest value");
		System.out.println("- If one players card is greater than 21, it will return the players card less than or equal to 21");
		System.out.println("\nAfter the dealer distributes the cards:");
		System.out.println("Player one's cards sum up to: " + integer1);
		System.out.println("Player two's cards sum up to: " + integer2);
		System.out.println("\nThe outcome is: " + firstGame.play(integer1, integer2));

	}

}
