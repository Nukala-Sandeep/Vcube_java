package com.loops;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to chech Automorphic number or not");
		int n=sc.nextInt();
		boolean status=isAutomorphic(n);
		if(status) {
			System.out.println(n+" is a Automorphic number.");
		}else {
			System.out.println(n+" is not a Automorphic number.");
		}
		sc.close();
	}

	static boolean isAutomorphic(int n) {
		boolean flag=false;
		if(n<0) {
			return flag;
		}
		
		String num=Integer.toString(n);
		long sqr=n*n;
		long num2=sqr%(int)(Math.pow(10, num.length()));
		if(n==num2) {
			flag=true;
		}
		return flag;
	}

}
