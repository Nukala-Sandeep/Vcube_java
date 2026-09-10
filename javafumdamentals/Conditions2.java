package com.javafumdamentals;

public class Conditions2 {
	void maxnum(int a,int b,int c) {
		if(a>b && a>c ) {
			System.out.println(a+" is greater than "+b+" and "+c);
		}else if(b>a && b>c ) {
			System.out.println(b+" is greater than "+a+" and "+c);
		}else if(a==b && b==c ) {
			System.out.println("three numbers are equal and number is "+a);
		}else {
			System.out.println(c+" is greater than "+a+" and "+b);
		}
	}
	void leapyear(int year) {
		if(year%4==0) {
			System.out.println(year+" is leap year.");
		}else {
			System.out.println(year+" is not leapyear.");
		}
	}
	void grade(int marks) {
		if(marks>=90) {
			System.out.println("A grade");
		}else if(marks>=75) {
			System.out.println("B grade");
		}else if(marks>=60) {
			System.out.println("C grade");
		}else if(marks>=50){
			System.out.println("D grade");
		}else {
			System.out.println("fail!");
		}
	}
	void checkAlphabet(char c) {
		c=Character.toLowerCase(c);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println(c+" is Vowel");
		}else if(c>='a' && c<='z'){
			System.out.println(c+" is consonant");
		}	else {
			System.out.println("not an alphabet!!");
		}
	}
	public String checkNumPON(int n) {
		if(n<0) {
			return n+" is Negitive number";
		}else if (n==0) {
			return n+" is Zero";
		}else {
			return n+" is Positive number";
		}
	}
	
	public static void main(String[] args) {
		Conditions2 c1=new Conditions2();
		c1.maxnum(23, 22, 45);
		c1.maxnum(0, 0, 0);
		c1.maxnum(1, 0, 3);
		c1.maxnum(0,20, 0);
		c1.maxnum(0, 0, 120);
		c1.leapyear(2036);
		c1.leapyear(2346);
		c1.grade(90);
		c1.checkAlphabet('j');
		c1.checkAlphabet('O');
		c1.checkAlphabet('3');
		System.out.println(c1.checkNumPON(4));
	}

}
