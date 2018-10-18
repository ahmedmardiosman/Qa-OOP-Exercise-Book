package com.qa.Coins;

public class Runner {

	public static void main(String[] args) {

		double priceOfItem = 423.97;

		double givenMoney = 600;

		changeFromTransaction(priceOfItem, givenMoney);

	}

	public static void changeFromTransaction(double priceOfItem, double givenMoney) {

		double change = givenMoney - priceOfItem;

		double numberofnotes;

		if (priceOfItem > givenMoney) {

			System.out.println("Insufficient Funds");
		} else {

			if (change >= 20) {
				numberofnotes = change / 20;
				System.out.println((int) numberofnotes + " - £20 note");
				change = change % 20;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 10) {
				numberofnotes = change / 10;
				System.out.println((int) numberofnotes + " - £10 note");
				change = change % 10;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 5) {
				numberofnotes = change / 5;
				System.out.println((int) numberofnotes + " - £5 note");
				change = change % 5;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 2) {
				numberofnotes = change / 2;
				System.out.println((int) numberofnotes + " - £2 coin");
				change = change % 2;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 1) {
				numberofnotes = change / 1;
				System.out.println((int) numberofnotes + " - £1 coin");
				change = change % 1;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 0.5) {
				numberofnotes = change / 0.5;
				System.out.println((int) numberofnotes + " - 50p coin");
				change = change % 0.5;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 0.2) {
				numberofnotes = change / 0.2;
				System.out.println((int) numberofnotes + " - 20p coin");
				change = change % 0.2;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 0.1) {
				numberofnotes = change / 0.1;
				System.out.println((int) numberofnotes + " - 10p coin");
				change = change % 0.1;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 0.05) {
				numberofnotes = change / 0.05;
				System.out.println((int) numberofnotes + " - 5p coin");
				change = change % 0.05;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 0.02) {
				numberofnotes = change / 0.02;
				System.out.println((int) numberofnotes + " - 2p coin");
				change = change % 0.02;
				change = Math.round(change * 100.0) / 100.0;

			}
			if (change >= 0.01) {
				numberofnotes = change / 0.01;
				System.out.println((int) numberofnotes + " - 1p coin");
				change = change % 0.01;
				change = Math.round(change * 100.0) / 100.0;

			}
		}
	}

}
