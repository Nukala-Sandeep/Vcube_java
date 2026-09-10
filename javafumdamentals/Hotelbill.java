package com.javafumdamentals;

import java.util.Scanner;

public class Hotelbill {
	Scanner sc=new Scanner(System.in);
	String roomType;
	double roomPrice;
	int noOfDays;
	double foodCharges;
	
		Hotelbill(){
			this("Unknown");
		}
		Hotelbill(Hotelbill h){
			this.roomType=h.roomType;
			this.roomPrice=h.roomPrice;
			this.noOfDays=h.noOfDays;
			this.foodCharges=h.foodCharges;
		}
		Hotelbill(String roomType){
			this(roomType,1);
		}
		Hotelbill(Hotelbill h1,int noOfDays,double foodCharges){
			this.roomType=h1.roomType;
			this.roomPrice=h1.roomPrice;
			this.noOfDays=noOfDays;
			this.foodCharges=foodCharges;
		}
		Hotelbill(String roomType,int noOfDays){
			this(roomType,noOfDays,1000.0);
		}
		Hotelbill(String roomType,int noOfDays,double roomPrice){
			this(roomType,noOfDays,roomPrice,250.0);
		}
		Hotelbill(Scanner sc){
			System.out.println("Enter Room type: ");
			String roomType=sc.next();
			System.out.println("Enter Number 0f days: ");
			int noOfDays=sc.nextInt();
			System.out.println("Enter room price: ");
			double roomPrice=sc.nextDouble();
			System.out.println("Enter Food charges: ");
			double foodCharge=sc.nextDouble();
			this(roomType,noOfDays,roomPrice,foodCharge);
		}
		Hotelbill(String roomType,int noOfDays,double roomPrice,double foodCharges){
			this.roomType=roomType;
			this.roomPrice=roomPrice;
			this.noOfDays=noOfDays;
			this.foodCharges=foodCharges;
		   
		}
		double roomCost(double roomPrice,int noOfDays) {
			double cost=roomPrice*noOfDays;
			return cost;
		}
		double finalBill(double roomCost,double foodCharges) {
			double fBill=roomCost+foodCharges;
			return fBill;
		}
		void show() {
			System.out.println("--New Room Booked!!--");
			System.out.println("Room type: "+roomType);
			System.out.println("Room Price: "+roomPrice);
			System.out.println("Number of days: "+noOfDays);
			double roomCost=roomCost(roomPrice,noOfDays);
			double finalBill=finalBill(roomCost,foodCharges );
			System.out.println("Room Cost: "+roomCost);
			System.out.println("Food Charges: "+foodCharges);
			System.out.println("Final Bill: "+finalBill);
			System.out.println("****************************************************************************************");
			
		}
		public static void main(String[] args) {
//			Scanner sc=new Scanner(System.in);
//			Hotelbill p1=new Hotelbill(sc);
//			p1.show();
			Hotelbill p2=new Hotelbill("Single room",4,1200);
			p2.show();
			Hotelbill p3=new Hotelbill(p2);
			p3.show();
			Hotelbill p4=new Hotelbill("Suit room",4,1800,2000);
			p4.show();
			Hotelbill p5=p4;
			p5.show();
			Hotelbill p6=new Hotelbill(p4,5,1800);
			p6.show();
			Hotelbill p7=p4=p5;
			p7.show();
			System.out.println(p3==p2);
			System.out.println(p5==p4);
//			System.out.println(p2+" "+p3);
			System.out.println(p7+" "+p4+" "+p5);
			
			
		}
		
		
}
