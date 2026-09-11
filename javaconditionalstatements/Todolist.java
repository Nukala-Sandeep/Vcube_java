package com.javaconditionalstatements;

import java.util.Scanner;

public class Todolist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time (hours.min) : ");
		double time = sc.nextDouble();

		if (time > 0 && time < 12) {
			System.out.println("emter am/pm");
			String amPm = sc.next();

			if (amPm.equalsIgnoreCase("am")) {
				if (time < 5 && time > 12) {
					System.out.println("Entered time is invalid !");

				} else if (time >= 5 && time <= 5.59) {
					System.out.println("wakeup");

				} else if (time >= 6 && time <= 6.59) {
					System.out.println("excersise");

				} else if (time >= 7 && time <= 7.59) {
					System.out.println("travel time");

				} else if (time >= 8 && time <= 8.59) {
					System.out.println("reached office");

				} else if (time >= 9 && time <= 9.59) {
					System.out.println("work begins");

				} else if (time >= 10 && time <= 10.59) {
					System.out.println("involvement in work completely");

				} else if (time >= 11 && time < 12) {
					System.out.println("good work");

				} else {
					System.out.println(" No schedule at this period of time");
				}

			} else if (amPm.equalsIgnoreCase("pm")) {
				if (time > 5) {
					System.out.println("No schedule at this time.");

				} else if (time >= 0 && time <= 0.59) {
					System.out.println("take lunch break");
				} else if (time >= 1 && time <= 1.59) {
					System.out.println("back to work");
				} else if (time >= 2 && time <= 2.59) {
					System.out.println("work in progress");
				} else if (time >= 3 && time <= 3.59) {
					System.out.println("end of days work ");
				} else if (time >= 4 && time<=4.59) {
					System.out.println("submiting end of the day work report  and going Home.");
				} else {
					System.out.println("time is invalid! ");
				}

			}else {
				
				System.out.println("check whether you entered wrong input insted of am or pm ");
			}
		} else {
			System.out.println("Enter valid time in 12hrs clock");
		}
		
	}
}
