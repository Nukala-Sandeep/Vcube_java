package com.javafumdamentals;

import java.util.Scanner;

public class Mobilebill {
	Scanner sc=new Scanner(System.in);
	String mobilemodel;
	double price;
	int quantity;
	double mobilecost;
	double deliverycharge;
	double finalbill;
	
	public Mobilebill (Scanner sc){
		System.out.println("Enter mobile model: ");
		mobilemodel=sc.nextLine();
		System.out.println("Enter price ");
		price=sc.nextDouble();
		System.out.println("Enter quantity: ");
		quantity=sc.nextInt();
		System.out.println("Enter delivery charge:");
		deliverycharge=sc.nextDouble();
		this.mobilemodel=mobilemodel;	
		this.price=price;
		this.quantity=quantity;
		this.deliverycharge=deliverycharge;
	}
	double mobilecost(double price,int quantity) {
		double mbcost=price*quantity;
		return mbcost;
	}
	double finalbill(double mbcost,double deliverycharge) {
		double finalbill=mbcost+deliverycharge;
		return finalbill;
	}
	void show() {
		System.out.println("Mobile  model: "+mobilemodel);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
		double mbcost=price*quantity;
		double finalbill=mbcost+deliverycharge;
		System.out.println("Mobile cost: "+mbcost);
		System.out.println("Final bill: "+finalbill);
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Mobilebill m1=new Mobilebill(sc);
		m1.show();
		
	}

}
