package com.assignments.array;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String usernames[] = new String[] { "mani", "venkat" };
		System.out.println("Enter user name");
		String name = sc.next();
		sc.close();
		boolean isPresent = false;

		for (String val : usernames) {
			if (name.equals(val)) {
				isPresent = true;
			}
		}
		if (isPresent) {
			System.out.println("Logged in Succesfully");
		} else {
			System.out.println("Invalid username");
		}
	}

}
