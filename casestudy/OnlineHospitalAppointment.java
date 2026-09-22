package com.casestudy;

import java.util.Scanner;

public class OnlineHospitalAppointment {
	static void display() {
		System.out.println("Please select patient type: ");
		System.out.println("1.Regular");
		System.out.println("2.Emergency");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter patient age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Patient age meets eligible criteria.");
			display();
			int patientType=sc.nextInt();
			if(patientType==1) {
				System.out.println("You have  selected the Regular Appointment");
				System.out.println("Check availability:");
				System.out.println("1.Available \n2.Not-Available");
				int availabe=sc.nextInt();
				if(availabe==1) {
					System.out.println("Your Regular Appointment is Conformed.");
				}else if(availabe==2){
					System.out.println("Please Select Another Slot.");
				}else {
					System.out.println("Invalid input");
				}
			}else if(patientType==2) {
				System.out.println("You have selected the Emergency Appointment");
				System.out.println("Check availability:");
				System.out.println("1.Available \n2.Not-Available"); 
				int availabe=sc.nextInt();
				if(availabe==1) {
					System.out.println("Your Emergency Appointment is Conformed.");
				}else if(availabe==2){
					System.out.println("Emergency Slot Not-Available.");
				}else {
					System.out.println("Invalid input");
				}
			}else {
				System.out.println("Invalid patient type.");
			}
		}else {
			System.out.println("Patient age is not sufficient.");
		}
		sc.close();
	}

}
