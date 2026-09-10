package com.javafumdamentals;

public class CalThrows {
	public static void divide(int a,int b)  throws ArithmeticException{
			
			int result;
			result=a/b;
			System.out.println(result);
			
		
	}

	public static void main(String[] args) {
		try {
			divide(5,0);
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide number with 0!");
		}

	}

}
