package com.javafumdamentals;

public class LoanManagement {
	String customerName;
	double loanAmount;
	double interestRate;
	int loantenure; 
	{
		System.out.println("****************************************************************************************************************");
		System.out.println("New customer!!!!");
	}
	public double calInterestRate(double loanAmount,double interestRate,int loantenure) {
		double simpleinterest=(loanAmount*loantenure*interestRate)/100;
		return simpleinterest;
	}
	public double calTotalAmount(double interestamount,double loanAmount) {
		
		double totalAmount=interestamount+loanAmount;
		return totalAmount;
	}
	public int monthlyEMI(double calTotalAmount,int loantenure) {
		double emi=calTotalAmount/(12*loantenure);
		return (int)emi;
	}
	void displayLoanSummary() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Loan Amount : "+loanAmount);
		System.out.println("LoanTenure: "+loantenure);
		System.out.println("Rate of Interest: "+interestRate);
		double simpleinterest= calInterestRate(loanAmount,interestRate,loantenure) ;
		double totalamount=calTotalAmount(simpleinterest, loanAmount);
		double emi=monthlyEMI(totalamount, loantenure);
		System.out.println("Simple Interest: "+calInterestRate(loanAmount,interestRate,loantenure));
		System.out.println("Total amount with interest: "+calTotalAmount(simpleinterest,loanAmount));
		System.out.println("EMI: "+monthlyEMI(totalamount, loantenure));
	}
	public static void main(String[] args) {
		LoanManagement l=new LoanManagement();
		l.customerName="Sandeep";
		l.loanAmount=100000;
		l.interestRate=3.0;
		l.loantenure=3;
		l.displayLoanSummary();
		
		LoanManagement l2=new LoanManagement();
		l2.customerName="Gowtham";
		l2.loanAmount=200000;
		l2.interestRate=3.0;
		l2.loantenure=2;
		l2.displayLoanSummary();
		
	}

}
