package com.casestudy;

public class MovieTheater {
	String movieName;
	String language;
	double ticketPrice;
	void displayMovieDetails() {
		System.out.println("Movie Name: "+movieName);
		System.out.println("Language: "+language);
		System.out.println("Ticket Price: "+ticketPrice);
		System.out.println("*****************************************************************************");
	}
	MovieTheater(String movieName,String language,double ticketPrice){
		this.movieName=movieName;
		this.language=language;
		this.ticketPrice=ticketPrice;
	}
	MovieTheater(MovieTheater m){
		this.movieName=m.movieName;
		this.language=m.language;
		this.ticketPrice=m.ticketPrice;
	}
	public MovieTheater(MovieTheater m,double ticketPrice) {
		this.movieName=m.movieName;
		this.language=m.language;	
		this.ticketPrice=ticketPrice;
	}
	public static void main(String[] args) {
		
		MovieTheater m1=new MovieTheater("SALAR","TELUGU", 150.0);
		m1.displayMovieDetails();
		MovieTheater m2=new MovieTheater(m1, 200.0);
		m2.displayMovieDetails();
		MovieTheater m3=m2;
		m3.displayMovieDetails();
	}

}
