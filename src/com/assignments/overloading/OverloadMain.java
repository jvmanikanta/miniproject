package com.assignments.overloading;
import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String names[] = new String[3];
		String designations[] = new String[3];
		double bonus;
		
		for(int i=0; i < 3; i++) {
			System.out.println("Employee " + (i+1) + "details");
			System.out.println("enter name");
			names[i] = sc.next();
			System.out.println("enter designation");
			designations[i] = sc.next();
			
		}
		
		Employee emp1 = new Employee(names[0], designations[0]);
		Employee emp2 = new Employee(names[1], designations[1]);
		Employee emp3 = new Employee(names[2], designations[2]);
		
		for(String var: designations) {
			switch(var) {
			case "Programmer":
				bonus = emp1.calcBonus(10);
				emp1.getDetails(bonus);
				break;
			
			case "Manager":
				bonus = emp2.calcBonus(10,100);
				emp2.getDetails(bonus);
				break;
				
			case "Director":
				bonus = emp3.calcBonus(10,100,1000);
				emp3.getDetails(bonus);
				break;
				
			default:
				System.out.println("Invalid designation");
			}
		}
		
		sc.close();

	}

}
