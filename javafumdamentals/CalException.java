package com.javafumdamentals;

public class CalException {

	public static void divide(int a,int b) {
		try {
			int result;
			result=a/b;
			System.out.println(result);
			
		} catch(ArithmeticException e) {
			System.out.println("Enter valid number!");
		}
			
		catch(Exception e){
			System.out.println("Exception!");
		}
			finally {
			System.out.println("Thank you for using myCalculator.");
		}

	}
	public static void main(String[] args) {
		divide(4,0);
	}

}
