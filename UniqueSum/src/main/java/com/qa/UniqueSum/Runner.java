package com.qa.UniqueSum;

public class Runner {

	public static void main(String[] args) {

		int integer1 = 2;
		int integer2 = 2;
		int integer3 = 2;

		System.out.println(sum(integer1, integer2, integer3));

	}

	public static int sum(int integer1, int integer2, int integer3) {

		if (integer1 == integer2 || integer1 == integer3 || integer2 == integer3) {
			return 0;
		} else {
			int sum = integer1 + integer2 + integer3;

			return sum;
		}

	}

}
