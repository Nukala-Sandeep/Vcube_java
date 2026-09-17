package com.javaconditionalstatements;

import java.util.Scanner;

public class Sumfor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter n :");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(i%3==0 && i%5==0) {
				sum=sum+i;
				System.out.println((sum-i)+" + "+i+" = "+sum);
			}
		}
		System.out.println("Sum= "+sum);
		
	}

}
