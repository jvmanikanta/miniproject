package com.assignments.array;

import java.util.Scanner;

public class AndOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x > y && x > z) {
			System.out.println("x is bigger");
		}
		else if(y>z) {
			System.out.println("y is bigger");
		}
		else {
			System.out.println("z is bigger");
		}
	}

}
