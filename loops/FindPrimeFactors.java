package com.loops;

public class FindPrimeFactors {

	public static void main(String[] args) {
		int n=85;
		while(n>1) {
			
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					n=n/i;
					System.out.print(i+"  ");

					break;
				}
			}
					}

	}

}
