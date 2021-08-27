package com.assignments.inheritance;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		//super.withdraw(amount);
		System.out.println("withdrawing " + amount);
		balance = balance - amount - 100;
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		//super.deposit(amount);
		System.out.println("depositing " + amount);
		balance = balance + amount + 100;
	}
	
	
	

}
