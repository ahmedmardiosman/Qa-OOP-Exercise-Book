package com.qa.BlackJack;

public class BlackJack {

	int integer1;

	int integer2;

	public BlackJack(int integer1, int integer2) {
		this.integer1 = integer1;
		this.integer2 = integer2;
	}

	public int play(int integer1, int integer2) {

		int value = 0;
		
		if (integer1 < 22 && integer2 < 22) {

			if (integer1 > integer2) {
				value = integer1;
			} else {
				value = integer2;
			}

		}else if (integer1 > 21 && integer2 > 21) {

			value = 0;
		} else if (integer1 <= 21 && integer2 > 21) {

			value = integer1;

		} else if (integer1 > 21 && integer2 <= 21) {

			value = integer2;
		}

		return value;

	}

}
