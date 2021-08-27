package com.assignments.abstraction;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account type s/c");
		String accType = sc.next();
		ABank bank = null;
		
		switch(accType) {
		case "s":
			bank = new Savings(5000);
			break;
		
		case "c":
			bank = new Current(7000);
			break;
		
		default:
			System.out.println("Enter valid account type");
			break;
		}
		
		bank.withdraw(500);
		bank.deposit(1000);
		double balance = bank.getBalance();
		System.out.println("balance is " + balance);
		sc.close();

	}

}
