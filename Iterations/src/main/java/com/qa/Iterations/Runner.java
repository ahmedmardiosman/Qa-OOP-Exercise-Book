package com.qa.Iterations;

public class Runner {

	public static void main(String[] args) {

		int A = 249;

		int B = 10;
		int numberOfTimesToPrint = 12;

		System.out.println("If " + A + " is greater than 200 then True will be printed");
		System.out.println(
				"If it is not greater that 200 then all numbers between " + A + " to 200 will be printed one by one");

		flowChartA(A);

		System.out.println(
				"If number is even and less than 200, it will print out '.' for the numbers between " + A + " and 200");
		System.out.println(
				"If number is odd and less than 200, it will print out '*' for the numbers between " + A + " and 200");
		System.out.println("If " + A + " is greater than 200 and even then it will print off '.'");
		System.out.println("If " + A + " is greater than 200 and odd then it will print off '*'");

		flowChartB(A);

		System.out.println("The numbers 1 - 10 printed out ten times each is as follows:");

		numberPrintOut(B, numberOfTimesToPrint);

	}

	public static void flowChartA(int A) {

		if (A < 200) {
			for (int i = A; i < 201; i++) {
				System.out.println(i);
			}

		} else {

			System.out.println("True");
		}

	}

	public static void flowChartB(int A) {

		if (A % 2 == 0) {
			if (A > 200) {
				System.out.println(".");
			} else {
				for (int i = A; i <= 200; i++) {
					System.out.println(".");
				}
			}

		} else {
			if (A > 200) {
				System.out.println("*");
			} else {
				for (int i = A; i <= 200; i++) {
					System.out.println("*");
				}
			}
		}

	}

	public static void numberPrintOut(int B, int numberOfTimesToPrint) {

		for (int i = 1; i <= 10; i++) {
			int x = 0;
			while (x < numberOfTimesToPrint) {
				System.out.println(i);
				x = x + 1;
			}

		}

	}

}
