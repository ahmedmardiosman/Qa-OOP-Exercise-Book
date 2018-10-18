package com.qa.Numbers;

public class Runner {

	public static void main(String[] args) {

		String number = "99";

		System.out.println("The adition of the numbers in " + number + " is: " + addNumber(number));

		System.out.println("The number " + number + " in words is " + numbersToWords(number));

	}

	public static int addNumber(String number) {

		char[] numberCharArray = number.toCharArray();

		int[] integerArray = new int[numberCharArray.length];

		for (int i = 0; i < numberCharArray.length; i++) {

			integerArray[i] = Character.getNumericValue(numberCharArray[i]);

		}

		int additionOfNumbers = 0;

		for (int i = 0; i < numberCharArray.length; i++) {

			additionOfNumbers = additionOfNumbers + integerArray[i];

		}

		return additionOfNumbers;

	}

	public static String numbersToWords(String number) {

		int numberInt = Integer.parseInt(number);

		String[] oneToTenWords = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };

		String[] spaceOneToTenWords = { "", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight",
				" Nine" };

		String[] elevenToNineteenWords = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"SevenTeen", "Eighteen", "Nineteen" };

		String[] tensWords = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };

		String[] numbersToWordsArray = new String[99];

		int i = 0;

		while (i < 10) {
			numbersToWordsArray[i] = oneToTenWords[i];
			i = i + 1;
		}

		while (i < 19) {
			numbersToWordsArray[i] = elevenToNineteenWords[i - 10];
			i = i + 1;
		}

		int l = 19;
		for (int j = 0; j < 8; j++) {
			for (int k = 0; k < 10; k++) {
				numbersToWordsArray[l] = tensWords[j] + spaceOneToTenWords[k];
				l = l + 1;
			}

		}

		String numberToWordChange = numbersToWordsArray[numberInt - 1];

		return numberToWordChange;

	}

}
