package com.javaconditionalstatements;

import java.util.Scanner;

public class LargestPrimeinRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start: ");
		int start=sc.nextInt();
		System.out.println("Enter end: ");
		int end=sc.nextInt();
		int largPrime=largestPrime(start,end);
		System.out.println("Largest Prime number between "+start+" and "+end+" is "+largPrime);
	}

	 static int largestPrime(int start, int end) {
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
					sn= start ;
				}
				
				start++;
				
			}
			return sn;
		
	}

}
