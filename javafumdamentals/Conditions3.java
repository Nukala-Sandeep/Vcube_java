package com.javafumdamentals;

public class Conditions3 {
	void calculate(int a,String opt,int b) {
		switch(opt){
			case "+":{
				int r=a+b;
				System.out.println("sum is "+r);
				break;
			}
			case "-":{
				int r=a-b;
				System.out.println("Difference is "+r);
				break;
				}
			case "*":{
				int r=a*b;
				System.out.println("product is "+r);
				break;
			}
			case "/":{
				if(b==0) {
					System.out.println("Cannot divide any number with 0");
				}else {
				int r=a/b;
				System.out.println("quotient is "+r);
				}
				break;
			}
			case "%":{
				int r=a%b;
				System.out.println("remainder is "+r);
				break;	
			}
			case "^":{
				int r=(int)Math.powExact(a, b);
				System.out.println(a+"^"+b+" is "+r);
				break;
			}
			default:{
				System.out.println("Invalid input!!");
			}
			
		}
	}
	void week(int day) {
		switch(day) {
		case 1: System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		case 0:System.out.println("Sunday");break;
		default:System.out.println("Enter valid number from 0 to 6 only. where 0 is sunday. ");
		}
	}
	void largerof3(int a,int b, int c) {
		if(a>b) {
			if(b>c) {
				System.out.println(a+" is greater than "+b+" and "+c);
			}else if(a>c) {
				System.out.println(a+" is greater than "+b+" and "+c);
			}
			else if(c>a){
				System.out.println(c+" is greater than "+a+" and "+b);
				
			}else if(a==c) {
				System.out.println("a==c val="+a);
				System.out.println(a+" is greater than "+b);
			}
		}else if(a==b || a==c) {
			if(b==c) {
				System.out.println("three numbers are equal "+a);
			}else if(a!=c) {
				System.out.println("a==b val="+a);
				if(a>c) {
					System.out.println(a+" is greater "+c);
				}else {
					System.out.println(c+" is greater than "+a);
				}
			}else if(a!=b) {
				System.out.println("a==c val="+a);
				if(a>b) {
					System.out.println(a+" is greater "+b);
				}else {
					System.out.println(b+" is greater than "+a);
				}
		}}
		else if(a<b){
			if(b>c){
				System.out.println(b+" is greater than "+a+" and "+c);
				}else {
					System.out.println(c+" is greater than "+a+" and "+b);
				}
		}
	}
	void eligible(int age,boolean citizenship) {
		if(age>=18) {
			if(citizenship) {
				System.out.println("Eligible");
			}else {
				System.out.println("Not Eligible");
			}
		}else {
			System.out.println("Not Eligible");
		}
	}
	
	public static void main(String[] args) {
		Conditions3 c1=new Conditions3();
		c1.calculate(56, "+",4);
		c1.calculate(56, "-",4);
		c1.calculate(56, "*",4);
		c1.calculate(56, "/",4);
		c1.calculate(56, "%",4);
		c1.calculate(2, "^",4);
		c1.calculate(56, "/",0);
		c1.week(0);
		c1.week(4);
		c1.week(7);
		c1.week(8%7);
		c1.week(14%7);
		c1.largerof3(3, 13, 23);
		c1.largerof3(13, 43, 23);
		c1.largerof3(33, 23, 53);
		c1.largerof3(33, 33, 35);
		c1.largerof3(33, 233, 233);
		c1.eligible(20, false);
		c1.eligible(20, true);
		c1.eligible(16, true);

	}

}
