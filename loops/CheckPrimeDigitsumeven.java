package com.loops;

import java.util.Scanner;
//Only prime numbers whose digits add up to an even number are considered special.
public class CheckPrimeDigitsumeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n to find special boxes: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isPrime(i) && digitSum(i)%2==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();

	}

	static int digitSum(int i) {
		int sum=0;
		
		while(i>0) {
			int r=i%10;
			i=i/10;
			sum=sum+r;
		}
		return sum;
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
