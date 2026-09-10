package com.javafumdamentals;

public class BasicArthOpr {
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public int div(int a,int b) {
		int c=a/b;
		return c;
		
	}
	public int rem(int a,int b) {
		int c=a%b;
		return c;
	}
	public double areaOfCircle(double r) {
		double area=3.14*r*r;
		return area;
	}
	public double simpleIntrest(int p,int t,double r) {
		double intrest=(p*t*r)/100;
		return intrest;
	}
	public static void main(String[] args) {
		BasicArthOpr b1=new BasicArthOpr();
		System.out.println(b1.add(12, 18));
		System.out.println(b1.sub(20, 10));
		System.out.println(b1.div(6, 3));
		System.out.println(b1.rem(6, 5));
		System.out.println(b1.areaOfCircle(3.5));
		System.out.println(b1.simpleIntrest(10000, 1, 30));
		System.out.println(Math.pow(-2,2));
		System.out.println(Math.pow(-2,3));
		System.out.println(Math.abs(-2));

	}

}
