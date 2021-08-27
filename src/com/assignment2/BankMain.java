package com.assignment2;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Bank b1 = new Bank(5000);
		System.out.println("Enter deposit amount");
		int depositAmount = sc.nextInt();
		b1.deposit(depositAmount);
		
		System.out.println("Enter withdraw amount");
		int withdrawAmount = sc.nextInt();
		b1.withdraw(withdrawAmount);
		
		System.out.println(b1.getBalance());
		sc.close();
		

	}

}
