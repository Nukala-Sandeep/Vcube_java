package com.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n to check palindrome: ");
		int n=sc.nextInt();
		int t=n;
		int rev=0;
		while(t>0) {
			int r=t%10;
			t=t/10;
			rev=rev*10+r;
		}
		if(rev==n) {
			System.out.println(n+" is Palindrome.");
		}else {
			System.out.println(n+" is not Palindrome.");
		}
		sc.close();
	}

}
