package com.casestudy;

import java.util.Scanner;

public class BikrRental {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Customers: ");
		int noOfCustomers = sc.nextInt();
		if (noOfCustomers < 0) {
			System.out.println("Invalid Input ");
		}else if (noOfCustomers == 0) {
			System.out.println("No customers ");
		} else {
			for (int i = 1; i <= noOfCustomers; i++) {
				System.out.println("Enter no of Bikes rented by customer"+i+" : ");
				int noOfBikes=sc.nextInt();
				double rent=0;
				if (noOfBikes < 0) {
					System.out.println("Invalid Input ");
				}else if (noOfBikes == 0) {
					System.out.println("No Bikes are taken for rent. ");
					continue;
				} else {
					int j=1;
					while(noOfBikes>=j) {
						double rate=50;
						System.out.println("Enter how many hours bike"+j+" is rented: ");
						int time=sc.nextInt();
						if(time<0) {
							System.out.println("Entered Invalid Time");
							
							continue;
						}else if(time<1) {
							System.out.println("Rent for bike" + j + " taken by customer" + i + " is :" + rate);
							rent = rent + rate;
							j++;
						} else {
							rate = time * 50;
							if (time > 4) {
								double discount = (10 / rate) * 100;
								rate = rate - discount;
							}

							System.out.println("Rent for bike" + j + " taken by customer" + i + " is :" + rate);
							rent = rent + rate;
							j++;
							
						}}
					
				}
				System.out.println("Total rent for bikes taken by customer"+i+" is :"+rent);
			}
		}
		sc.close();
	}

}
