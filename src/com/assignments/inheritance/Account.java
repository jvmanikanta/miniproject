package com.assignments.inheritance;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(double amount) {
		System.out.println("Withdrawing " +amount);
		balance -= amount;
	}
	
	void deposit(double amount) {
		System.out.println("Depositing " + amount);
		balance += amount;
	}
	
	double getBalance() {
		return balance;
	}
}
