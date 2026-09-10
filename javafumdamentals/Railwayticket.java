package com.javafumdamentals;

public class Railwayticket {
	String passengerName;
	int age;
	String start;
	String destination;
public static void main(String[] args) {
	
}
}
class Child extends Railwayticket{
	int noOfTickets;
	double price=500;
	Child (){
		this("unknown");
	}
	Child (String passengerName){
		this(passengerName,5);
	}
	Child (String passengerName,int age){
		this(passengerName,age,"unknown");
	}
	Child (String passengerName,int age,String start){
		this(passengerName,age,start,"unknown");
	}
	Child(String passengerName,int age,String start,String destination){
		this(passengerName,age,start,destination,0);
	}
	Child(String passengerName,int age,String start,String destination,int noOfTickets){
		this(passengerName,age,start,destination,noOfTickets,500.0);
	}
	Child(String passengerName,int age,String start,String destination,int noOfTickets,double price){
		super();
		this.passengerName=passengerName;
		this.age=age;
		this.start=start;
		this.destination=destination;
		this.noOfTickets=noOfTickets;
		this.price=price;
	}
	double bookticket(int noOfTickets,double price) {
		double cost=noOfTickets*price;
		System.out.println("tickets booked Successfully!!");
		return cost;
	}
	void display() {
		System.out.println("Passanger Name: "+passengerName);
		System.out.println("age: "+age);
		System.out.println("Starting loc:"+start);
		System.out.println("Destination: "+destination);
		System.out.println("No of Tickets: "+noOfTickets);
		System.out.println("Price: "+price);
		double totalcost=bookticket(noOfTickets,price);
		System.out.println("total cost: "+totalcost);
		System.out.println("***********************************************************************************************************");
		
	}
	 public static void main(String[] args) {
		Child c1=new Child();
		c1.display();
		Child c2=new Child("Vinod",20,"Khammam","Hyderabad",3);
		c2.display();
		Child c3=new Child("Sandeep",23,"Hyderabad","Khammam",1,200);
		c3.display();
	}
}
