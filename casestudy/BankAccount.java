package com.casestudy;

import java.util.Scanner;

public class BankAccount {
	Scanner sc=new Scanner(System.in);
	int accountNo;
	String customerName;
	double balance;
	public BankAccount() {
		this(0);
	}
	public BankAccount(int accountNo ){
		this(accountNo,"Unknown");
	}
	public BankAccount(int accountNo,String customerName) {
		this(accountNo,customerName,0.0);
	}
	
	public BankAccount( int accountNo, String customerName,double balance) {
		
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance=balance;
	}
	 void showCustomerdetails() {
		 System.out.println("Account No: "+accountNo);
		 System.out.println("Customer Name: "+customerName);
		 System.out.println("Balance: "+ balance);
	 }
	void showbalance() {
		System.out.println("current balance in accno: "+accountNo +" is: "+balance);
	}
	double deposit(Scanner sc) {
		System.out.println("enter amount to deposit: ");
		double amount=sc.nextDouble();
		if(amount>0) {
		 balance=balance+ amount;
		 System.out.println("Rs "+amount +" deposited Successfully.");
		}else {
			System.out.println("Enter valid amount!!");
		}
		 return balance;
	}
	double withdraw(Scanner sc) {
		System.out.println("enter amount to withdraw: ");
		double amount=sc.nextDouble();
		if(amount<balance && amount>0) {
		 balance=balance -amount;
		 System.out.println("Rs "+amount+" withdrawed Successfully.");
		}else {
			System.out.println("Insufficient balance!! ");
		}
		 return balance;
	}
	double transferfrom(Scanner sc) {
		System.out.println("enter amount to send: ");
		double amount=sc.nextDouble();
		if(balance>amount && amount>0) {
		balance = balance -amount;
		System.out.println("Rs "+amount+" sent from accno: "+accountNo);
		
		}else {
			amount=-1;
			System.out.println("Insufficient balance!! ");
		}
		return amount;
	}
	double transferto(double amount) {
		if(amount>0) {
		balance = balance +amount;
		System.out.println("Rs "+amount+" received to accno: "+accountNo);
		}else {
			System.out.println("Transaction Failed!!");
		}
		return balance;
	}
	double interest(double rate) {
		double interest=(balance*rate)/100;
		System.out.println("Interest for 1 year at rate of "+rate+"% is "+interest);
		return interest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount a1=new BankAccount(101,"Sandeep",10000);
		a1.showCustomerdetails();
		a1.deposit(sc);
		a1.showbalance();
		BankAccount a2=new BankAccount(102,"Jack",50000);
		a2.showCustomerdetails();
		a2.deposit(sc);
		a2.showbalance();
		double amount = a1.transferfrom(sc);
	    a2.transferto(amount);
		
		
		a1.showbalance();
		a2.showbalance();
		a2.interest(2);
	}

}
