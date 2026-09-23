package com.loops;

public class FindPrimeFactors {

	public static void main(String[] args) {
		int n=85;
		while(n>1) {
			int i=2;
			for(;i<=n;i++) {
				if(n%i==0) {
					break;
				}
			}
			n=n/i;
			System.out.print(i+"  ");
		}

	}

}
