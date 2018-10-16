package com.qa.Conditionals;

public class Runner {

	public static void main(String[] args) {

		int integer1 = 50;
		int integer2 = 108;
		boolean bool = false;

		System.out.println(outputNumber(integer1, integer2, bool));

	}

	public static int outputNumber(int integer1, int integer2, boolean bool) {

		int output = 0;

		if (integer1 % 2 == 0 && integer2 % 2 == 0) {
			output = 0;

		} else if (bool == true)

		{
			output = integer1 + integer2;

		} else if (bool == false) {
			output = integer1 * integer2;

		}

		return output;

	}

}
