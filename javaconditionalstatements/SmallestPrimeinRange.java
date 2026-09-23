package com.javaconditionalstatements;

import java.util.Scanner;

public class SmallestPrimeinRange {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Start: ");
	int start=sc.nextInt();
	System.out.println("Enter End: ");
	int end=sc.nextInt();
	int smallprime=smallestprime(start,end);
	System.out.println("Smallest prime between "+start+" and "+end+" is :"+smallprime);
	}

	static int smallestprime(int start, int end) {
		int sn=0;
		
		while(start<=end) {
			boolean status =true;
			for(int i=2;i<=start/2;i++) {
				if(start%i==0) {
					status=false;
					break;
				}
			}
			if(status) {
				return start ;
			}
			
			start++;
			
		}
		return sn;
	}

}
