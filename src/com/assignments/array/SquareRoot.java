package com.assignments.array;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		double newArray[] = new double[length];
		System.out.println("populating");
		for (int i=0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<array.length; i++) {
			int j = array[i];
			newArray[i] = Math.sqrt(j);
		}
		for(double i: newArray) {
			System.out.println(i);
		}
	}

}
