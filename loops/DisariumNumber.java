package com.loops;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check disarium number or not: ");
		int n=sc.nextInt();
		boolean status=isDisariumNum(n);
		if(status) {
			System.out.println(n+" is a Disarium Number.");
		}else {
			System.out.println(n+" is not a Disarium Number.");
		}
		sc.close();

	}

	static boolean isDisariumNum(int n) {
		boolean flag=false;
		if(n<0) {
			return flag;
		}
		if(n>=0 && n<10) {
			return true;
		}
		
		int r=0;
		long sum=0;
		int temp=n;
		String num=Integer.toString(n);
		int count2=num.length();
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=(long)(sum+Math.pow(r, count2--));
		}
		if(sum==temp) {
			flag=true;
		}
		return flag;
	}

}
