package com.assignments.abstraction;

public class Savings extends ABank {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdrawing amount " + amount);
		balance = balance - amount - 100;
		
	}

	@Override
	void deposit(double amount) {
		System.out.println("depositing amount " + amount);
		balance = balance + amount + 100;
		
	}
	

}
