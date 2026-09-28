package com.loops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check magic number or not: ");
		int n=sc.nextInt();
		boolean status=isMagicNum(n);
		if(status) {
			System.out.println(n+" is magic number.");
		}else {
			System.out.println(n+" is not magic number.");
		}
		
		sc.close();

	}

	static boolean isMagicNum(int n) {
		boolean flag = false;
		if (n <= 0) {
			return false;
		}
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
			if (n == 0 && sum < 10) {
				if (sum == 1) {
					flag = true;
				}

			} else if (n == 0 && sum >= 10) {
				n = sum;
				sum = 0;
			}
		}

		return flag;
	}

}
