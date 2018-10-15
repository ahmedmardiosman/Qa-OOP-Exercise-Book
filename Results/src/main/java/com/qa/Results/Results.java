package com.qa.Results;

import java.util.ArrayList;
import java.util.List;

public class Results {

	int physics;
	int chemistry;
	int biology;
	int total;
	double percentage;

	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;

	}

	public List<Integer> listOfMarks() {

		List<Integer> resultsList = new ArrayList<Integer>();

		total = physics + chemistry + biology;

		resultsList.add(physics);
		resultsList.add(chemistry);
		resultsList.add(biology);
		resultsList.add(total);

		return resultsList;

	}

	public double percentage() {

		double total = physics + chemistry + biology;

		percentage = (total * 100) / 450;

		return percentage;
	}

	public void passOrFail() {

		if (percentage() < 60 || physics < 90 || chemistry < 90 || biology < 90) {
			System.out.println("Unfortunatley, you have failed");

			if (physics < 90) {
				System.out.println("You have not met the mimimum threshold to pass Physics");
			}

			if (chemistry < 90) {
				System.out.println("You have not met the mimimum threshold to pass Chemistry");
			}

			if (biology < 90) {
				System.out.println("You have not met the mimimum threshold to pass Biology");
			}

		} else {
			System.out.println("Congratulations, you have passed \nYou have met the minimum grades for each subject");
		}
	}

}
