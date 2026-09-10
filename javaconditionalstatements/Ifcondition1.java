package com.javaconditionalstatements;

public class Ifcondition1 {

	public static void main(String[] args) {
		double num=10,age=23;
		String name="Sandeep";
		 if(num>0) 
			 System.out.println("number is positive number");
		 System.out.println("number is negative number");
		 System.out.println("number is 0");
 
		 
  		if(age>=18) { 
  			System.out.println("you are eligible voting"); 
  		}
  		System.out.println("not eligible for voting");
 		System.out.println("Your age is "+age);
 		
 		if(name.length()<10) {
 			System.out.println("you are eligible");
 		}
 		
 		System.out.println("you are not eligible!");
 		
		
		
	}
}
