package com.oops;

import java.util.Scanner;

class Payment{
	String customerName;
	double amount;
	public Payment(String customerName,double amount){
		this.customerName=customerName;
		this.amount=amount;
	}
	void makePayment() {
		System.out.println("parent makePayment called");
	}
	void display() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Amount: "+amount);
	}
}
class Upipayment extends Payment{
	static Scanner sc=new Scanner(System.in);
	String upiId;
	public Upipayment(String customerName,double amount,String upiId) {
		super(customerName,amount);
		this.upiId=upiId;
	}
	
	void makePayment() {
		System.out.println("Enter UPI ID: ");
		String valid=sc.next();
		
		if(upiId.equals(valid)) {
			System.out.println("Your upiId is valid");
			
		}else {
			System.out.println("Your upiId is not valid");
		}
		
	}
	void display() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Amount: "+amount);
		System.out.println("UpiId: "+upiId);
	}
	
	
}
class Cardpayment extends Payment{
	static Scanner sc=new Scanner(System.in);
	int cvv;
	public Cardpayment(String customerName,double amount,int cvv) {
		super(customerName,amount);
		this.cvv=cvv;
	}
	void makePayment() {
		System.out.println("Enter cvv: ");
		int valid=sc.nextInt();
		if(cvv==valid) {
			System.out.println("Your cvv is valid");
			
		}else {
			System.out.println("Your cvv is not valid");
		}
		
	}
	void display() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Amount: "+amount);
		System.out.println("Cvv: "+cvv);
	}
}
class CashPayment extends Payment{
	double cash;
	public CashPayment(String customerName,double amount,double cash) {
		super(customerName,amount);
		this.cash=cash;
	}
	void makePayment() {
		
		if(cash>amount) {
			System.out.println("You have sufficient cash");
			
		}else {
			System.out.println("You have insufficient cash");
		}
	}
	void display() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Amount: "+amount);
		System.out.println("cash: "+cash);
		System.out.println("cash in return: "+(cash-amount));
	}
	
}
public class Payment123 {
public static void main(String[] args) {
	Payment upi=new Upipayment("Sandeep", 100, "sandeep@axl");
	upi.makePayment();
	upi.display();
	System.out.println("******************************************************************************");
	Payment card=new Cardpayment("Abhinay", 200,833);
	card.makePayment();
	card.display();
	System.out.println("******************************************************************************");
	Payment cash=new CashPayment("Sandeep", 300,500 );
	cash.makePayment();
	cash.display();
}
}
