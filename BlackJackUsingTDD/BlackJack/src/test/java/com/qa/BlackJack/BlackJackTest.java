package com.qa.BlackJack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackJackTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void playTest1() {

		BlackJack blackjack = new BlackJack(10, 22);

		assertEquals(10, blackjack.play(10, 22));

	}

	@Test
	public void playTest2() {

		BlackJack blackjack = new BlackJack(22, 9);

		assertEquals(9, blackjack.play(22, 9));

	}

	@Test
	public void playTest3() {

		BlackJack blackjack = new BlackJack(22, 22);

		assertEquals(0, blackjack.play(22, 22));

	}

	@Test
	public void playTest4() {

		BlackJack blackjack = new BlackJack(10, 7);

		assertEquals(10, blackjack.play(10, 7));

		System.out.println(blackjack.play(10, 7));

	}

	@Test
	public void playTest5() {

		BlackJack blackjack = new BlackJack(1, 19);

		assertEquals(19, blackjack.play(1, 19));

	}

}
