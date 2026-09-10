package com.javafumdamentals;

public class ATM {
	static String bankname;
	long accno;
	double balance=0;
	{
		System.out.println("**************************************************");
		System.out.println("New User!!");
	}
	void showBalance() {
		System.out.println("Current balance is "+balance );
	}
	
	void deposite(double amount) {
		balance=balance+amount;
		System.out.println(" Amount "+amount+" Deposited successfully!! ");
	}
	void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Amount "+amount+"  Withdrawl successfull!!  ");
	}
	
	public static void main(String[] args) {
		ATM a1=new ATM();
		bankname="SBI";
		a1.accno=404123416478l;
		a1.balance=0;
		a1.showBalance();
		a1.deposite(5000);
		a1.showBalance();
		a1.withdraw(1000);
		a1.showBalance();
		
		ATM a2=new ATM();
		a2.accno=405523416478l;
		a2.balance=0;
		a2.showBalance();
		a2.deposite(50000);
		a2.showBalance();
		a2.withdraw(20000);
		a2.showBalance();
	}

}
