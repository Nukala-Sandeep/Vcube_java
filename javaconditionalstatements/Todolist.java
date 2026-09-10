package com.javaconditionalstatements;

import java.util.Scanner;

public class Todolist {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter time and am/pm: ");
	double time=sc.nextDouble();
	System.out.println("emter am/pm");
	String amPm=sc.next();
	if (time<0 && time>12) {
		System.out.println("Enter valid time in 12hrs clock");
	}
	if(amPm.equalsIgnoreCase("am")) {
		if(time<5 && time>12) {
			System.out.println("Entered time is invalid !");
			System.out.println();
		}else if(time>=5 && time<6){
			System.out.println("good morning");
			
		}else {
			System.out.println("next time");
		}
		
	}
	
	
	}
}
