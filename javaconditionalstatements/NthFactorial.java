package com.javaconditionalstatements;

import java.util.Scanner;

public class NthFactorial {
	static int nthFact(int num,int n) {
		if(n==0 || n>num || num==0) {
			return 0;
		}
		if(num==1 && n==1) {
			return 1;
		}
		int count=0;
		
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
			if(count==n) {
				return i;
			}
			if(i==num/2 && n==count+1) {
				return num;
			}
			
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to find factorials: ");
		int num=sc.nextInt();
		System.out.println("Enter n to find nth factorial of num");
		int n=sc.nextInt();
		System.out.print("Nth Factorial is: ");
		System.out.print(nthFact(num,n));
	}

}
