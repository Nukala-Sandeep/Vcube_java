package com.loops;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee no: ");
		int empno = sc.nextInt();
		if (empno < 2) {
			System.out.println("Employee is not special.");

		} else {
			boolean status = true;
			for (int i = 2; i <= empno/2; i++) {

				if (empno % i == 0) {
					status = false;
					
					break;
				}
			}
			if (status) {
				System.out.println("Employee is special.");
			} else {
				System.out.println("Employee is not special.");
			}
			sc.close();
		}
	}

}
