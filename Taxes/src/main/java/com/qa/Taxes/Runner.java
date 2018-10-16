package com.qa.Taxes;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		double salary = 30000;

		System.out.println("Your salary after it has been taxed is £" + taxedSalary(salary).get(0)
				+ " and the amount deducted for tax is £" + taxedSalary(salary).get(1));

	}

	public static List<Double> taxedSalary(double salary) {

		double salaryAfterTax = 0;
		double taxPaid = 0;

		if (salary <= 14999) {
			salaryAfterTax = salary;
			taxPaid = salary - salaryAfterTax;

		} else if (salary <= 19999) {
			salaryAfterTax = salary * 0.9;
			taxPaid = salary - salaryAfterTax;
		} else if (salary <= 29999) {
			salaryAfterTax = salary * 0.85;
			taxPaid = salary - salaryAfterTax;

		} else if (salary <= 44999) {
			salaryAfterTax = salary * 0.8;
			taxPaid = salary - salaryAfterTax;

		} else if (salary > 44999) {
			salaryAfterTax = salary * 0.75;
			taxPaid = salary - salaryAfterTax;
			
		}

		List<Double> salaryAterTaxAndTaxPaid = new ArrayList<Double>();

		salaryAterTaxAndTaxPaid.add(salaryAfterTax);
		salaryAterTaxAndTaxPaid.add(taxPaid);

		return salaryAterTaxAndTaxPaid;

	}

}
