package com.assignments.inheritance;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		//super.withdraw(amount);
		System.out.println("withdrawing " + amount);
		balance = balance - amount - 500;
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		//super.deposit(amount);
		System.out.println("Depositing "+ amount);
		balance = balance + amount + 500;
	}
	
	

}
