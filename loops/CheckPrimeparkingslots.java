package com.loops;

import java.util.Scanner;
//Finds all prime-numbered parking slots from 1 to N and no of slots available?
public class CheckPrimeparkingslots {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n to find parking slots: ");
		int n=sc.nextInt();
		int count=0;
		if (n > 1) {
			for (int i = 2; i <=n; i++) {
				if (isPrime(i)) {
					System.out.print(i + " ");
					count++;
				}
			}
			System.out.println();
			System.out.println("Total Available slots are : "+count);
		}
		sc.close();
		
	}

	static boolean isPrime(int i) {
		boolean flag=true;
		if(i<2) {
			return false;
		}
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

}
