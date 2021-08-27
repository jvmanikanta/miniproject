package com.assignments.array;

import java.util.Scanner;

public class Registeration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String usernames[] = new String[length];
		for (int i = 0; i < usernames.length; i++) {
			usernames[i] = sc.next();
		}
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
			System.out.println("not unique");
		} else {
			System.out.println("Registered");
		}
	}
}
