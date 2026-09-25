package com.loops;

import java.util.Scanner;

public class HappyNumber {
static int sqrsum(int n) {
	int sum=0;
	while(n>0) {     
		int r=n%10;
		n=n/10;
		sum=sum+r*r;
		
	}
	return sum;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		int num=n;
		int temp=n;
		do {
			 num=sqrsum(num);
			temp=sqrsum(sqrsum(temp));
			
			System.out.println("num : "+num+" temp: " +temp);
			
			
		}while(num!=temp) ;
			if(num==1) {
				System.out.println(n+" is Happy Number.");
				
			}else {
				System.out.println(n+" is not a Happy Number.");
			}
		
		

	}

}
