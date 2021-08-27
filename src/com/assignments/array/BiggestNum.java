package com.assignments.array;

public class BiggestNum {

	public static void main(String[] args) {
		int x = 30, y =20, z = 48;
		String result = 
				(x>y && x>z)?"X is bigger" : (y>z) ? "Y is bigger" : "Z is bigger";
		System.out.println(result);
	}

}
