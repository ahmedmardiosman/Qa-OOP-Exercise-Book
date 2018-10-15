package com.qa.Results;

public class Runner {

	public static void main(String[] args) {

		Results studentResults = new Results(10, 20, 150);

//		System.out.println(
//				"The following list shows results for physics, biology, chemistry and the total result of all three exams:");
//		studentResults.listOfMarks().forEach(System.out::println);
//		
		System.out.println("The students Physics mark was: " + studentResults.listOfMarks().get(0));
		System.out.println("The students Chemistry mark was: " + studentResults.listOfMarks().get(1));
		System.out.println("The students Biology mark was: " + studentResults.listOfMarks().get(2));
		System.out.println("The students total marks: " + studentResults.listOfMarks().get(3));

		System.out.println("The students overall percentage for all exams taken was : " + studentResults.percentage());

		studentResults.passOrFail();

	}

}
