package com.javaconditionalstatements;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		if(marks>100 || marks<0) {
			System.out.println("Invalid marks!");
		}else if(marks>=90 && marks<=100) {
			System.out.println(marks+ " A grade");
		}else if(marks>=75 && marks<=89) {
			System.out.println(marks+ " B grade");
		}else if(marks>=60 && marks<=74) {
			System.out.println(marks+" C grade");
		}else if(marks>=40 && marks<=59) {
			System.out.println(marks+" D grade");
		}else  {
			System.out.println(marks+ " Fail");
		}
		
	}

}
