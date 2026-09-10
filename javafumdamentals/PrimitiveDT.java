package com.javafumdamentals;

public class PrimitiveDT {

	public static void main(String[] args) {
		Integer i=9;
		int a=i;
		Character ch='w';
		 char c1='9';
		char c=ch;
		String s="121";
		int si=Integer.parseInt(s);
		si++;
		System.out.println("Byte MAX_VALUE: "+Byte.MAX_VALUE+" , "+Byte.MIN_VALUE);
		System.out.println("Short MAX_VALUE: "+Short.MAX_VALUE+" , "+Short.MIN_VALUE);
		System.out.println("Integer MAX_VALUE: "+Integer.MAX_VALUE+" , "+Integer.MIN_VALUE);
		System.out.println("Long MAX_VALUE: "+Long.MAX_VALUE+" , "+Long.MIN_VALUE);
		System.out.println("Character MAX_VALUE: "+Character.MAX_VALUE+" , "+Character.MIN_VALUE);
		System.out.println("Float MAX_VALUE: "+Float.MAX_VALUE+" , "+Float.MIN_VALUE);
		System.out.println("Double MAX_VALUE: "+Double.MAX_VALUE+" , "+Double.MIN_VALUE);
		System.out.println("String Length: "+s.length());
		System.out.println(a);
		System.out.println((double)a);
		System.out.println(++a);
		System.out.println(--a);
		System.out.println((char)si);
		System.out.println(c);
		System.out.println((int)c);
		System.out.println("c1:"+c1);
		System.out.println(s);
		System.out.println(si);
		
	}
}
