package com.loops;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n to find largest digit in num:");
		int n=sc.nextInt();
		if (n >= 1) {
			int max = n % 10;
			while (n > 0) {
				int r = n % 10;
				n = n / 10;
				if (r > max) {
					max = r;
				}
			}
			System.out.println(max);
		}else {
			System.out.println("Given value is less than 1 which is not acceptable.");
		}
		sc.close();
	}

}
