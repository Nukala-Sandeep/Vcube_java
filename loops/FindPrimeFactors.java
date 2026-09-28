package com.loops;

public class FindPrimeFactors {

	public static void main(String[] args) {
		int n=15;
		while(n>1) {
			
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					System.out.print(i+"  ");
					n=n/i;


					break;
				}
			}
					}

	}

}
