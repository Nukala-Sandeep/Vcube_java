package com.javaconditionalstatements;

import java.util.Scanner;

public class NthPrime {
	static boolean isPrime(int num) {
		boolean status=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return status;
		
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n to get nth prime number: ");
		int n=sc.nextInt();
		int num=2;
		int count=0;
		while(count<n) {
		if(isPrime(num)) {
			count++;
		}
		if(count==n) {
			System.out.println(num);
			break;
		}
		num++;
		}
		sc.close();
	}

}
