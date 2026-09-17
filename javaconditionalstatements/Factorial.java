package com.javaconditionalstatements;

import java.util.Scanner;

public class Factorial {
static void factors(int n) {
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			System.out.print(i+" ");
		}
	}
	System.out.println(n);
}
static boolean isPerfect(int n) {
	boolean status=false;
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			sum +=i;
		}
	}
	if(sum==n) {
		status=true;
	}
	return status;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		factors(n);
		boolean flag=isPerfect(n);
		
		if(flag) {
			System.out.println(n+ " is Perfect Number.");
		}else {
			System.out.println(n+ " is not Perfect Number.");
		}
	}

}
