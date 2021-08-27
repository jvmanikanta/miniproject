package com.assignment2;

public class Vehicle {
	String name;
	String model;
	int price;
	
	Vehicle(String name, String model, int price){
		this.name = name;
		this.model = model;
		this.price = price;
		
	}
	
	void getDetails() {
		System.out.println("Name is " + name);
		System.out.println("Model is " + model);
		System.out.println("price is" + price);
	}

}
