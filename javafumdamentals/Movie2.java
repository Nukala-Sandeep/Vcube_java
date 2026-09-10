package com.javafumdamentals;

public class Movie2 {
	static String theatername;
	static String manager;
	int movieid;
	String moviename;
	String heroname;
	int availableseats;
	
	
	void displaymoviedetails() {
		System.out.println("Movie Id: "+movieid);
		System.out.println("Movie Name: "+moviename);
		System.out.println("Hero Name: "+heroname);
		System.out.println("Available Seats: "+availableseats);
		System.out.println("*********************************************************************************************************************************");
	}
	void bookseats() {
		
		availableseats=availableseats-1;
		
	}
	static void displaytheaterdetails() {
		System.out.println("Theater Name: "+theatername);
		System.out.println("Manager Name: "+manager);
	}
	static void changemanager() {

		manager="Karthik";
		System.out.println("Manager Changed! ");
	}
	public static void main(String[] args) {
		Movie2 m1=new Movie2();
		m1.movieid=1;
		m1.moviename="Vikram";
		m1.heroname="Kamal Hassan";
		m1.availableseats=200;
		theatername="Vimal 70mm";
		manager="Anandh";
		displaytheaterdetails();
		m1.displaymoviedetails();
		
		Movie2 m2=new Movie2();
		m2.movieid=2;
		m2.moviename="Spiderman";
		m2.heroname="Tom";
		m2.availableseats=150;
		m2.displaymoviedetails();
		
		m2.bookseats();
		m2.bookseats();
		m2.bookseats();
		m2.bookseats();
		m1.bookseats();
		m1.bookseats();
		m1.displaymoviedetails();
		m2.displaymoviedetails();
		changemanager();
		displaytheaterdetails();
	}

}
