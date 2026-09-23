package com.loops;

import java.util.Scanner;

public class NthdistinctPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start: ");
		int start=sc.nextInt();
		System.out.println("Enter end: ");
		int end=sc.nextInt();
		System.out.println("Enter n for finding nth distinct prime: ");
		int n=sc.nextInt();
		int nthNum=nthDistPrime(start,end,n);
		System.out.println("Nth distinct prime is "+nthNum);
		sc.close();
	}

	static int nthDistPrime(int start, int end, int n) {
		int count=0;
		while (start<=end) {
			boolean status=true;
			for(int i=2;i<=start/2;i++) {
				if(start%i==0) {
					status=false;
				}
			}
			if(status) {
				count++;
				
			}
			if(count==n) {
				return start;
			}
			start++;
		}
		return 0;
	}

}
