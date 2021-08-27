package com.assignments.abstraction;

public class Current extends ABank {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdrawing amount " + amount);
		balance = balance - amount - 200;
		
	}

	@Override
	void deposit(double amount) {
		System.out.println("Withdrawing amount " + amount);
		balance = balance + amount + 200;
		
	}
	
	

}
