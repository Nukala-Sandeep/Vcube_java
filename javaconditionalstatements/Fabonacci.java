package com.javaconditionalstatements;

import java.util.Scanner;

public class Fabonacci {
	static void fabonacci(int n) {
		int f1=0;
		int f2=1;
		int f3=0;
		for(int i=1;i<=n;i++) {
			System.out.println(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		fabonacci(n);
	}

}
