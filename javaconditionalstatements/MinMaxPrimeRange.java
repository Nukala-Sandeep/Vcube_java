package com.javaconditionalstatements;

import java.util.Scanner;

public class MinMaxPrimeRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start:");
		int start=sc.nextInt();
		System.out.println("Enter end:");
		int end=sc.nextInt();
		
		int minPrime=minPrime(start,end);
		int maxPrime=maxPrime(start,end);
		System.out.println("Minimum prime number between "+start+" and "+end+" is "+minPrime);
		System.out.println("Maximum prime number between "+start+" and "+end+" is "+maxPrime);
		

	}

	 static int maxPrime(int start, int end) {
		
			while (start <= end) {
				boolean status = true;
				for (int i = 2; i <= end/ 2; i++) {
					if (end % i == 0) {
						status = false;
					}

				}
				if (status) {
					return end;
				}
				end--;
			}
			return 0;
		

	}

	 static int minPrime(int start, int end) {
		
		while (start <= end) {
			boolean status = true;
			for (int i = 2; i <= start / 2; i++) {
				if (start % i == 0) {
					status = false;
				}

			}
			if (status) {
				return start;
			}
			start++;
		}
		return 0;
	}

}
