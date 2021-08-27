package com.assignment2;

public class Bank {
	double balance;
	
	Bank(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(int x) {
		this.balance = balance - x;
	}
	
	public void deposit(int y) {
		this.balance = balance + y;
	}
	
	public double getBalance() {
		return balance;
	}

}
