package com.javafumdamentals;

public class ChatgptQnsCondition {
	void findChar(char c) {
		if(c>='a' && c<='z') {
			System.out.println(c+" is a LowerCase alphabet.");
		}else if(c>'A' && c<='Z') {
			System.out.println(c+" is an UpperCase alphabet.");
		}else if(c>='0' && c<='9') {
			System.out.println(c+" is a Number.");
		}else {
			System.out.println(c+" is a Special Symbol.");
		}
	}
	void largeOf3(int a,int b,int c) {
		String large=(a>b && a>c)? a+" is greater":(b>c)?b+" is greater":c+" is greater.";
		System.out.println(large);
	}
	void divisible3Or5(int num) {
		if(num%3==0 ) {
			System.out.println(num+" is divisible by 3.");
		}else if(num%5==0) {
			System.out.println(num+" is divisible by 5.");
		}else {
			System.out.println(num+" is not divisible by either 3 or 5.");
		}
	}
	void divisible3and5not7(int num) {
		if(num%(3*5)==0 && num%7!=0 ) {
			System.out.println(num+" is divisible by 3 and 5 but not 7.");
		}else if(num%(3*5)==0 && num%7==0) {
			System.out.println(num+" is divisible by 3,5 and7.");
		}
		else if(num%7==0 && num%5!=0 && num%3!=0) {
			System.out.println(num+" is divisible by 7 .");
		}
		else {
			System.out.println(num+" is not divisible by  both (3 and 5) or 7.");
		}
	}
	void validTriangle3sides(int a,int b,int c) {
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			System.out.println("triangle is posible.");
		}else {
			System.out.println("triangle is not possable");
		}
	}
	void triangleType(int a,int b,int c) {
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			System.out.println("triangle is posible.");
		
		if(a==b && a==c) {
			System.out.println("Equilateral Triangle.");
		}else if(a==b || a==c || b==c) {
			System.out.println("Isosceles Triangle.");
		}else {
			System.out.println("Scalene Triangle.");
		}}else {
			System.out.println("triangle is not possable");
		}
	}
	void checkNoOfDigits(int num) {
		
		if (num==0) {
			System.out.println("number is 0");
		}else if (num>0 && num<10) {
			System.out.println("number is single digit number");	
		}
		else if(num>9 && num<100) {
			System.out.println("number is 2 digit number");	
		}else if(num>99 && num<1000) {
			System.out.println("number is 3 digit number");
		
		}else {
			System.out.println("number contain more than three digits");
		}
	}
	public static void main(String[] args) {
		ChatgptQnsCondition c1=new ChatgptQnsCondition();
		int a=10;
		c1.findChar('a');
		c1.findChar('A');
		c1.findChar('1');
		c1.findChar('0');
		c1.findChar('#');
		c1.findChar('_');
		c1.largeOf3(4, 5, 3);
		c1.divisible3Or5(35);
		c1.divisible3Or5(36);
		c1.divisible3Or5(30);
		c1.divisible3and5not7(35);
		c1.divisible3and5not7(49);
		c1.divisible3and5not7(30);
		c1.divisible3and5not7(210);
		c1.validTriangle3sides(30, 80, 100);
		c1.triangleType(18, 19, 20);
		c1.triangleType(20, 20, 30);
		c1.triangleType(30, 30, 30);
		c1.checkNoOfDigits(23);
		c1.checkNoOfDigits(234);
		System.out.println(a>5?100:200);
		c1.largeOf3(41, 5, 300);
	}

}
