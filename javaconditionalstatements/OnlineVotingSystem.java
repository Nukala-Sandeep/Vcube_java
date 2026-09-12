package com.javaconditionalstatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Enter gender: ");
			char g=sc.next().charAt(0);
			if(g=='m' || g=='M' || g=='f' || g=='F') {
				System.out.println("Enter voter Id: ");
				long voterId=sc.nextLong();
				System.out.println("--------------------------------------------------");
				System.out.println("Candidates :");
				System.out.println("1.Sandeep");
				System.out.println("2.Shiva");
				System.out.println("3.Abhinay");
				System.out.println("4.Nikil");
				System.out.println("5.Yaswanth");
				System.out.println("6.Nota");
				System.out.println("--------------------------------------------------");
				System.out.println("Choose candidate: ");
				int opt=sc.nextInt();
				switch(opt) {
				case 1->System.out.println("You cast your vote to Sandeep");
				case 2->System.out.println("You cast your vote to Shiva");
				case 3->System.out.println("You cast your vote to Abhinay");
				case 4->System.out.println("You cast your vote to Nikil");
				case 5->System.out.println("You cast your vote to Yaswanth");
				case 6->System.out.println("You cast your vote to Nota");
				default->System.out.println("invalid choise!!");
				
				}
				System.out.println("Your voting is successful. ");
				System.out.println("Thank you for your valuable contribution.");
				
			}else {
				System.out.println("Not eligibile");
			}
		}else {
			System.out.println("Not elegible");
		}
	}

}


