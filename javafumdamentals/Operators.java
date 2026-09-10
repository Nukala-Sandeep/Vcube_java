package com.javafumdamentals;

public class Operators {
	public String evenOdd(int a) {
		int rem=a%2;
		String result=(rem==0)?"even":"odd";
		return result;
	}
	public int rem(int a,int b) {
		int r=a%b;
		return r;
	}
	public int lastDigit(int a) {
		int ld=a%10;
		return ld;
	}public int maxNum(int a,int b) {
		int result=a>b?a:b;
		return result;
	}
	public String voteElg(int age) {
		String p=age>=18?"Eligible":"Not Eligible";
		return p;
	}
	public int total(int a,int b,int c,int d,int e,int f) {
		int total=a+b+c+d+e+f;
		return total;
		
	}
	public double avg(int total) {
		
		double avrg=total/6;
		return avrg;
	}
	public static void main(String[] args) {
		Operators op1=new Operators();
		System.out.println(op1.evenOdd(11));
		System.out.println(op1.rem(5,2));
		System.out.println(op1.lastDigit(254));
		System.out.println(op1.maxNum(30,20));
		System.out.println(op1.voteElg(23));
		int total=op1.total(23, 25, 22, 18, 20, 25);
		double avg=op1.avg(total);
		System.out.println(total);
		System.out.println(avg);
		 int a=10;
		 int b=5;
		 int c= a++ + ++b*2- --a;
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 System.out.println("c="+c);
	}

}
