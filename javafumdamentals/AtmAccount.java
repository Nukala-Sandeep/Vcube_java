package com.javafumdamentals;

public class AtmAccount {
	static int accno;
	String cName;
	double balance;
	String accStatus;
	static {
		System.out.println("Welcome to ATM Services!");
	}
	{
		System.out.println("New User: ");
		accno++;
	}
	
void account() {
	System.out.println();
	System.out.println("Account No: "+accno);
	System.out.println("Customer Name: "+cName);
	System.out.println("Balance: "+balance);
	System.out.println("Account Status: "+accStatus);
	System.out.println("*************************************************************************************");
    
}
	public static void main(String[] args) {
		AtmAccount A1=new AtmAccount();
		A1.accno=121;
		A1.cName="Sandeep";
		A1.balance=23000.0;
		A1.accStatus="Active";
		A1.account();
		
		AtmAccount A2=new AtmAccount();
		
		A2.cName="Venky";
		A2.balance=28000.0;
		A2.accStatus="Active";
		A2.account();
		
AtmAccount A3=new AtmAccount();
		
		A3.cName="Uppi";
		A3.balance=30000.0;
		A3.accStatus="Active";
		A3.account();
	}
	


}
