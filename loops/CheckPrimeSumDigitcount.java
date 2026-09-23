package com.loops;
//number is prime,exactly 2 digits sum of num is prime. 
import java.util.Scanner;
public class CheckPrimeSumDigitcount {

	public static void main(String[] args) {
		CheckPrimeDigitsumeven c=new CheckPrimeDigitsumeven();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n to check priority: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if (i >= 10 && i < 100) {
				if (c.isPrime(i) && c.isPrime(c.digitSum(i))) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}

}
