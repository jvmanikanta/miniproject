package com.assignments.abstraction;

public abstract class ABank {
	double balance;
	
	public ABank(double balance) {
		super();
		this.balance = balance;
		System.out.println("Balance amount is " + balance);
	}
	
	abstract void withdraw(double amount);
	
	abstract void deposit(double amount);
	
	double getBalance() {
		return balance;
	}
	
}
