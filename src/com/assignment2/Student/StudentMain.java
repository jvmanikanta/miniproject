package com.assignment2.Student;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name");
		String name = sc.next();
		System.out.println("Enter student id");
		int id = sc.nextInt();
		
		Student s1 = new Student(name, id);
		System.out.println("Enter no of subjests");
		int subjects = sc.nextInt();
		System.out.println("Enter marks");
		int marks[] = new int[subjects];
		for(int i=0; i<marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		sc.close();
		
		s1.getGrades(marks);

	}

}
