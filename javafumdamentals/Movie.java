package com.javafumdamentals;

public class Movie {
	String movieName;
	int releasedYear;
	double price;
	void display() {
		System.out.println("Movie Name: "+movieName);
		System.out.println("Released Year: "+releasedYear);
		System.out.println("Price: "+price);
		
	}

	public static void main(String[] args) {
		Movie m1=new Movie();
		m1.movieName="SALAR";
		m1.releasedYear=2024;
		m1.price=150.0;
		m1.display();
		System.out.println("*************************************************************************************");
		Movie m2=new Movie();
		m2.movieName="EEga";
		m2.releasedYear=2012;
		m2.price=100.0;
		m2.display();
		System.out.println("*************************************************************************************");
		Movie m3=new Movie();
		m3.movieName="DC";
		m3.releasedYear=2026;
		m3.price=150.0;
		m3.display();
	}

}
