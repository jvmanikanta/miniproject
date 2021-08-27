package com.assignment2.Student;

public class Student {
	String name;
	int id;
	
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	void getDetails() {
		System.out.println("name is "+name);
		System.out.println("id is "+id);
	}
	
	void getGrades(int marks[]){
		int sum = 0;
		for(int i =0; i < marks.length; i++) {
			sum += marks[i];
		}
		System.out.println("sum is " + sum);
		System.out.println("Avg is " + (sum/marks.length));
	}

}
