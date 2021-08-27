package com.assignments.array;
import java.util.Scanner;

public class OneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		System.out.println("sum is " + sum);
		System.out.println("Avg is " + (sum/arr.length));

	}

}
