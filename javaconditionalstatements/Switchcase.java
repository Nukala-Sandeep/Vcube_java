package com.javaconditionalstatements;

import java.util.Scanner;

public class Switchcase {
	 
	void selectfoodtype() {
		System.out.println("Choose veg or non veg.");
		System.out.println("1.Vegetarian ");
		System.out.println("2.Non Vegetarian");
	}

	void showVegMenu() {
		System.out.println("1.Paneer Biryani         Rs:300");
		System.out.println("2.Veg Meals              Rs:120");
		System.out.println("3.Veg Biryani            Rs:400");
		System.out.println("4.Veg Munchurian         Rs:120");
		System.out.println("5.Veg Fried Rice         Rs:100");
		System.out.println("*************************************************************************************");
	}

	void showNonVegMenu() {
		System.out.println("1.Chicken Biryani        Rs:240");
		System.out.println("2.Motton Biryani         Rs:520");
		System.out.println("3.Egg Biryani            Rs:150");
		System.out.println("4.Chicken Fried Rice     Rs:120");
		System.out.println("5.Chicken 65             Rs:200");
		System.out.println("*******************************************************************************************");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nod = 0;
		double price=0;
		String selectedItem="";
		String s;
		Switchcase s1 = new Switchcase();
		do {
		s1.selectfoodtype();
		System.out.println("Enter your choice: ");
		int n = sc.nextInt();
		switch (n) {
			case 1: {
				System.out.println("You choosen vegetarian.");
				s1.showVegMenu();
				String choice;
				do {
				System.out.println("Select your dish: ");
				int food = sc.nextInt();
				switch (food) {
					case 1: {
						nod++;
						price+=300;
						selectedItem += nod + ". Paneer Biryani         Rs:300\n";
						System.out.println("You selected Paneer Biryani");
						break;
					}
					case 2: {
						nod++;
						price+=120;
						selectedItem += nod + ". Veg Meals              Rs:120\n";
						System.out.println("You selected Veg Meals");
						break;
					}
					case 3: {
						nod++;
						price+=400;
						selectedItem +=nod + ". Veg Biryani            Rs:400\n";
						System.out.println("You selected Veg Biryani");
						break;
					}
					case 4: {
						nod++;
						price+=120;
						selectedItem +=nod + ". Veg Munchurian         Rs:120\n";
						System.out.println("You selected Veg Munchurian");
						break;
					}
					case 5: {
						nod++;
						price+=100;
						selectedItem +=nod + ". Veg Fried Rice         Rs:100\n";
						System.out.println("You selected Veg Fried Rice");
						break;
					}
					default: {
						System.out.println("Dish is not available!");
					}
				}
				System.out.println("Do you want to add more items in veg: ");
				System.out.println("enter (y) to continue,any other to exit from veg");
			    choice=sc.next();
				
				}while(choice.equalsIgnoreCase("y"));
				break;
				}
			
			case 2:{
				System.out.println("You choosen Non-Veg.");
				s1.showNonVegMenu();
				String choice2;
				do {
				System.out.println("Select your dish: ");
				int food = sc.nextInt();
				switch (food) {
					case 1: {
						nod++;
						price+=240;
						selectedItem +=nod + ". Chicken Biryani        Rs:240\n";
						System.out.println("You selected Chicken Biryani");
						break;
					}
					case 2: {
						nod++;
						price+=520;
						selectedItem +=nod + ". Motton Biryani         Rs:520\n";
						System.out.println("You selected Motton Biryani");
						break;
					}
					case 3: {
						nod++;
						price+=150;
						selectedItem +=nod + ". Egg Biryani            Rs:150\n";
						System.out.println("You selected Egg Biryani");
						break;
					}
					case 4: {
						nod++;
						price+=120;
						selectedItem +=nod + ". Chicken Fried Rice     Rs:120\n";
						System.out.println("You selected Chicken Fried Rice");
						break;
					}
					case 5: {
						nod++;
						price+=200;
						selectedItem +=nod + ". Chicken 65             Rs:200\n";
						System.out.println("You selected Chicken 65");
						break;
					}
					default: {
						System.out.println("Dish is not available!");
					}
				}
				System.out.println("Do you want to add more items in non veg: ");
				System.out.println("enter (y) to continue,any other to exit from non-veg");
			    choice2=sc.next();
				
				}while(choice2.equalsIgnoreCase("y"));
				break;
			}
			default: {
				System.out.println("You Entered invalid option!");
			}
		}
		System.out.println("Do you want to add more items in veg or non-veg: ");
		System.out.println("enter (y) to continue,any other to exit from menu");
	    s=sc.next();
		

	}while(s.equalsIgnoreCase("y"));
		
		System.out.println("\nYour Selected Items:");
		System.out.println(selectedItem);
		System.out.println("Total Items: " + nod );
		System.out.println("Total cost:               Rs:"+price);
}}
