package com.javafumdamentals;

public class Conditions {

	public String posOrneg(int n) {
		if(n<0) {
			return n+" is Negitive number";
		}else if (n==0) {
			return n+" is Zero";
		}else {
			return n+" is Positive number";
		}
	}
	public String evevorodd(int a) {
		int r=a%2;
		if(r==0) {
			return a+" is even";
		}else {
			return a+" is odd";
		}
	}
	public String voteelg(int age) {
		if(age>=18) {
			return "Eligible";
		}else {
			return "Not Eligible";
		}
	}
	public String maxnum(int a,int b) {
		if(a>b) {
			return a+" greater than "+b;
		}else if (a==b) {
			return a+" and" +b+" are equal";
		}else {
			return b+" is greater than "+a;
		}
	}
	public String divby5(int n) {
		if(n%10==5|| n%10==0) {
			return n+" is divisible by 5";
		}else {
			return n+" is not divisible by 5";
		}
	}
	public static void main(String[] args) {
		Conditions c1=new Conditions();
		System.out.println(c1.posOrneg(2));
		System.out.println(c1.posOrneg(0));
		System.out.println(c1.posOrneg(-5));
		System.out.println(c1.evevorodd(59+1));
		System.out.println(c1.voteelg(18));
		System.out.println(c1.maxnum(23, 48));
		System.out.println(c1.divby5(32));
		System.out.println(c1.divby5(15));
		System.out.println(c1.divby5(10));
		System.out.println(c1.divby5(0));
		
	}

}
