package com.assignments.inheritance;

import java.util.Scanner;

public class ATMmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of account s/c");
		String accType = sc.next();
		Account account;
		switch(accType) {
		case "S":
			account = new Savings(5000);
			break;

		case "C":
			account = new Current(7000);
			break;
			
		default:
			account = new Account(1000);
			break;
		}
		account.withdraw(500);
		account.deposit(1000);
		double balance = account.getBalance();
		System.out.println("balance is " + balance);
		sc.close();
	}

}
