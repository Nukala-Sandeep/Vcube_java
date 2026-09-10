package com.javafumdamentals;
import java.util.Scanner;


public class VotingThrow {
	public static void votingSystem(int age) {
		if(age>18) {
			System.out.println("You are eligible for voting");
		}else {
			throw new ArithmeticException("Your age is less than 18.Not eligible for voting!");
		}
	}
	public static void main(String[] args) {
		CalThrows CT=new CalThrows();
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			votingSystem(age);
			CT.divide(5, 0);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.exit(0);
			System.out.println("Every vote count.");
			
		}
		sc.close();
		
	}

}
