package com.loops;

import java.util.Scanner;
//The number itself is prime.The first digit is also prime.The last digit is also prime.
public class PrimeFirstLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  n for validation: ");
		int n=sc.nextInt();
		
		if(isPrime(n) && isFirstLastPrime(n)) {
			System.out.println(n+" is correct verification number.");
		}else {
			System.out.println(n+" is incorrect verification number.");
		}
		sc.close();
	}

	static boolean isFirstLastPrime(int n) {
		boolean status=false;
		if(n<=1) {
			return false;
		}
		int last=n%10;
		int first=n%10;
		while(n>10) {
			n=n/10;
		}
		first=n;
		if(isPrime(first) && isPrime(last)) {
			status=true;
		}
		return status;
	}

	static boolean isPrime(int n) {
		boolean flag=true;
		if(n<2) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

}
