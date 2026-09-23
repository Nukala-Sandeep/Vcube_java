package com.loops;

import java.util.Scanner;

//Write a Java program to determine whether the given PIN is secure.prime and greater than 10,
public class CheckPrimeKey {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key: ");
		int key=sc.nextInt();
		if(isSecure(key)) {
			System.out.println("The key is Secure.");
		}else {
			System.out.println("The key is not secure.");
		}
		sc.close();

	}

	static boolean isSecure(int key) {
		boolean flag=true;
		if(key<10) {
			return false;
		}
		for(int i=2;i<=key/2;i++) {
			if(key%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

}
