package com.javafumdamentals;

public class Bitwiseoperators {
	static void test(int a,int b) {
		System.out.println(a & b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a+" "+~b);
		System.out.println((a<<1)+" "+(b<<1));
		System.out.println((a>>1)+" "+(b>>1));
		System.out.println((a>>>1)+" "+(b>>>1));
		System.out.println(a & b |a);
		System.out.println(a | b ^a);
	}
	public static void main(String[] args) {
		test(33,2);

	}

}
