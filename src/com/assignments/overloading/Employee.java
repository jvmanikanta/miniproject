package com.assignments.overloading;

public class Employee {
	String name, designation;

	Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	double calcBonus(double basicAllowance) {
		double bonus = basicAllowance * (11.5 / 100);
		return bonus;
	}

	double calcBonus(double basicAllowance, double carAllowance) {
		double bonus = (basicAllowance + carAllowance) * (11.5 / 100);
		return bonus;
	}

	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		double bonus = (basicAllowance + carAllowance + houseAllowance) * (11.5 / 100);
		return bonus;
	}
	
	void getDetails(double bonus) {
		System.out.println("employee name " + name +" employee designation " + designation + " employee bonus "+bonus);
	}
}
