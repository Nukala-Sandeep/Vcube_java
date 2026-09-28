package com.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Neon number or not :");
		int n=sc.nextInt();
		boolean status=isNeonNum(n);
		if(status) {
			System.out.println(n+" is Neon number.");
		}else {
			System.out.println(n+" is not Neon number.");
		}
		sc.close();
	}

	static boolean isNeonNum(int n) {
		boolean flag=false;
		if(n<=0) {
			return false;
		}
		int r=0;
		int sum=0;
		long n1=n*n;
		while(n1>0) {
			r=(int)(n1%10);
			n1=n1/10;
			sum=sum+r;
			
		}
		if(sum==n) {
			flag=true;
		}
		
		return flag;
	}

}
