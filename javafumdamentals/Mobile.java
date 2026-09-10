package com.javafumdamentals;

public class Mobile {
	static String brand;
	String model;
	double price;
	int ram;
	static {
		System.out.println("Welcome to Mobile!");
	}
	{System.out.println("New Model is arrived!");}
	static void display() {
		System.out.println("Brand: "+brand);
	}
	void show() {
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("Ram: "+ram);
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		brand="SAMSUNG";
		m1.model="Samsung S21";
		m1.price=15999.00;
		m1.ram=8;
		display();
		m1.show();

		System.out.println("***************************************************************************************************************************");
		
		Mobile m2=new Mobile();
		m2.model="Samsung F2";
		m2.price=19999.00;
		m2.ram=8;
		display();
		m2.show();
		
		System.out.println("***************************************************************************************************************************");
		Mobile m3=new Mobile();
		brand="Poco ";
		m3.model="Poco F6 pro";
		m3.price=21000.00;
		m3.ram=8;
		display();
		m3.show();
		

		
	}

}
