package com.javaconditionalstatements;

import java.util.Scanner;

public class Switchcase {
	 
	void selectfoodtype() {
		System.out.println("Choose veg or non veg.");
		System.out.println("1.Vegetarian ");
		System.out.println("2.Non Vegetarian");
		System.out.println("3.Starters");
		System.out.println("4.Soups");
		System.out.println("5.Drinks");
	}

	void showVegMenu() {
		System.out.println("1.Paneer Biryani         Rs:300");
		System.out.println("2.Veg Meals              Rs:120");
		System.out.println("3.Veg Biryani            Rs:400");
		System.out.println("4.Veg Munchurian         Rs:120");
		System.out.println("5.Veg Fried Rice         Rs:100");
		System.out.println("6.Mashroom birayani      Rs:230");
		System.out.println("7.Dhal Fry               Rs:60");
		System.out.println("*************************************************************************************");
	}

	void showNonVegMenu() {
		System.out.println("1.Chicken Biryani        Rs:240");
		System.out.println("2.Motton Biryani         Rs:520");
		System.out.println("3.Egg Biryani            Rs:150");
		System.out.println("4.Chicken Fried Rice     Rs:120");
		System.out.println("5.Chicken 65             Rs:200");
		System.out.println("6.Fish fry               Rs:100");
		System.out.println("7.Prawns curry           Rs:100");
		System.out.println("*******************************************************************************************");

	}
	void showStarters() {
		System.out.println("1.Hara Bara Kabab        Rs:150");
		System.out.println("2.Paneer Tikka           Rs:180");
		System.out.println("3.Fries                  Rs:180");
		System.out.println("4.Tandoori Babycorn      Rs:190");
		System.out.println("5.Paneer Pakoda          Rs:250");
		System.out.println("6.Mashroom Tikka         Rs:200");
		System.out.println("*******************************************************************************************");

	}
	void showSoups() {
		System.out.println("1.Mottton soup           Rs:79");
		System.out.println("2.Sweet corn soup        Rs:79");
		System.out.println("3.Mashroom Soup          Rs:79");
		System.out.println("4.Prawns Royal Soup      Rs:120");
		System.out.println("*******************************************************************************************");

	}
	void showDrinks() {
		System.out.println("1.Mango juice            Rs:50");
		System.out.println("2.Coke                   Rs:100");
		System.out.println("3.Gin and Tonic          Rs:150");
		System.out.println("4.Scotch on the rocks    Rs:200");
		System.out.println("5.Beer                   Rs:140");
		System.out.println("*******************************************************************************************");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Switchcase s1 = new Switchcase();
		int nod = 0;
		double price=0;
		String selectedItem="";
		String s;
		
		do {
		s1.selectfoodtype();
		System.out.println("Enter your choice: ");
		int n = sc.nextInt();
		switch (n) {
			case 1: {
				System.out.println("You choosen vegetarian.");
				String choice;
				do {
				s1.showVegMenu();
				System.out.println("Select your dish: ");
				int food = sc.nextInt();
				int quantity=0;
				switch (food) {
					case 1: {
						nod++;
						
						System.out.println("You selected Paneer Biryani");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*300);
						selectedItem += nod + ". Paneer Biryani         Rs:300    "+quantity+"    	 "+quantity*300+ "\n";
						break;
					}
					case 2: {
						nod++;
						System.out.println("You selected Veg Meals");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*120);
						selectedItem += nod + ". Veg Meals              Rs:120    "+quantity+"    	 "+quantity*120+ "\n";
						
						break;
					}
					case 3: {
						nod++;
						System.out.println("You selected Veg Biryani");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*400);
						selectedItem +=nod + ". Veg Biryani            Rs:400    "+quantity+"    	 "+quantity*400+"\n";
						break;
					}
					case 4: {
						nod++;
						System.out.println("You selected Veg Munchurian");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*120);
						selectedItem +=nod + ". Veg Munchurian         Rs:120    "+quantity+"     	"+quantity*120+"\n";
						break;
					}
					case 5: {
						nod++;
						System.out.println("You selected Veg Fried Rice");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*100);
						selectedItem +=nod + ". Veg Fried Rice         Rs:100    "+quantity+"     	"+quantity*100+"\n";
						break;
					}case 6:{
						nod++;
						System.out.println("You selected Mashroom birayani ");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*230);
						selectedItem +=nod + ". Mashroom birayani      Rs:230    "+quantity+"     	"+quantity*230+ "\n";
						break;
					}
					case 7:{
						nod++;
						System.out.println("You selected Dhal fry ");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*60);
						selectedItem +=nod + ". Dhal fry               Rs:60     "+quantity+"     	"+quantity*60+"\n";
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
				String choice2;
				int quantity=0;
				do {
					s1.showNonVegMenu();
				System.out.println("Select your dish: ");
				int food = sc.nextInt();
				switch (food) {
					case 1: {
						nod++;
						System.out.println("You selected Chicken Biryani");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*240);
						selectedItem +=nod + ". Chicken Biryani        Rs:240    "+quantity+"    	 "+quantity*240+"\n";
						break;
					}
					case 2: {
						nod++;
						System.out.println("You selected Motton Biryani");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*520);
						selectedItem +=nod + ". Motton Biryani         Rs:520    "+quantity+"    	 "+quantity*520+"\n";
						break;
					}
					case 3: {
						nod++;
						System.out.println("You selected Egg Biryani");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*150);
						selectedItem +=nod + ". Egg Biryani            Rs:150    "+quantity+"    	 "+quantity*150+"\n";
						break;
					}
					case 4: {
						nod++;
						System.out.println("You selected Chicken Fried Rice");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*120);
						selectedItem +=nod + ". Chicken Fried Rice     Rs:120    "+quantity+"    	 "+quantity*120+"\n";
						break;
					}
					case 5: {
						nod++;
						System.out.println("You selected Chicken 65");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*200);
						selectedItem +=nod + ". Chicken 65             Rs:200    "+quantity+"     	"+quantity*200+"\n";
						break;
					}
					case 6:{
						nod++;
						System.out.println("You selected Fish fry");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*100);
						selectedItem +=nod + ". Fish fry               Rs:100    "+quantity+"     	"+quantity*100+"\n";
						break;
					}
					case 7:{
						nod++;
						System.out.println("You selected Prawns curry");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*100);
						selectedItem +=nod + ". Prawns curry           Rs:100    "+quantity+"     	"+quantity*100+"\n";
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
			case 3:{
				System.out.println("You choosen Starters.");
				String choice3;
				int quantity=0;
				do {
					s1.showStarters();
				System.out.println("Select your dish: ");
				int food = sc.nextInt();
				switch (food) {
					case 1: {
						nod++;
						System.out.println("You selected Hara Bara Kabab");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*150);
						selectedItem +=nod + ". Hara Bara Kabab        Rs:150    "+quantity+"     	"+quantity*150+"\n";
						break;
					}
					case 2: {
						nod++;
						System.out.println("You selected Paneer Tikka");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*180);
						selectedItem +=nod + ". Paneer Tikka           Rs:180    "+quantity+"     	"+quantity*180+"\n";
						break;
					}
					case 3: {
						nod++;
						System.out.println("You selected Fries");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*180);
						selectedItem +=nod + ". Fries                  Rs:180    "+quantity+"    	 "+quantity*180+"\n";
						break;
					}
					case 4: {
						nod++;
						System.out.println("You selected Tandoori Babycorn");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*190);
						selectedItem +=nod + ". Tandoori Babycorn      Rs:190    "+quantity+"   	  "+quantity*190+"\n";
						break;
					}
					case 5: {
						nod++;
						System.out.println("You selected Paneer Pakoda");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*250);
						selectedItem +=nod + ". Paneer Pakoda          Rs:200    "+quantity+"  	 	  "+quantity*200+ "\n";
						break;
					}
					case 6:{
						nod++;
						System.out.println("You selected Mashroom Tikka");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*200);
						selectedItem +=nod + ". Mashroom Tikka         Rs:100    "+quantity+"   	  "+quantity*100+ "\n";
						break;
					}
					default: {
						System.out.println("Dish is not available!");
					}
				}
				System.out.println("Do you want to add more items in starters: ");
				System.out.println("enter (y) to continue,any other to exit from starters");
			    choice3=sc.next();
				
				}while(choice3.equalsIgnoreCase("y"));
				break;
			}
			case 4:{
				System.out.println("You choosen Soups.");
				String choice4;
				int quantity=0;
				do {
					s1.showSoups();
				System.out.println("Select your dish: ");
				int food = sc.nextInt();
				switch (food) {
					case 1: {
						nod++;
						System.out.println("You selected Motton Soup");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*79);
						selectedItem +=nod + ". Motton Soup            Rs:79     "+quantity+"    	 "+quantity*79+"\n";
						break;	
					}
					case 2: {
						nod++;
						System.out.println("You selected Sweet Corn Soup");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*79);
						selectedItem +=nod + ". Sweet Corn Soup        Rs:79     "+quantity+"   	  "+quantity*79+"\n";
						break;
					}
					case 3: {
						nod++;
						System.out.println("You selected Mashroom Soup");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*79);
						selectedItem +=nod + ". Mashroom Soup          Rs:79     "+quantity+"   	  "+quantity*79+"\n";
						break;
					}
					case 4: {
						nod++;
						System.out.println("You selected Prawns Royal Soup");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*120);
						selectedItem +=nod + ". Prawns Royal Soup      Rs:120    "+quantity+"   	  "+quantity*120+"\n";
						break;
					}
					
					default: {
						System.out.println("Dish is not available!");
					}
				}
				System.out.println("Do you want to add more items in Soups: ");
				System.out.println("enter (y) to continue,any other to exit from Soups");
			    choice4=sc.next();
				
				}while(choice4.equalsIgnoreCase("y"));
				break;
			}
			case 5:{
				System.out.println("You choosen Drinks.");
				String choice5;
				int quantity=0;
				do {
					s1.showDrinks();
				System.out.println("Select your Drink: ");
				int food = sc.nextInt();
				switch (food) {
					case 1: {
						nod++;
						System.out.println("You selected Mango juice");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*50);
						selectedItem +=nod + ". Mango juice            Rs:50     "+quantity+"   	  "+quantity*50+"\n";
						break;
					}
					case 2: {
						nod++;
						System.out.println("You selected Coke");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*100);
						selectedItem +=nod + ". Coke                   Rs:100    "+quantity+"    	 "+quantity*100+"\n";
						break;
					}
					case 3: {
						nod++;
						System.out.println("You selected Gin and Tonic");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*150);
						selectedItem +=nod + ". Gin and Tonic          Rs:150    "+quantity+"     	"+quantity*150+"\n";
						break;
					}
					case 4: {
						nod++;
						System.out.println("You selected Scotch on the rocks ");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*120);
						selectedItem +=nod + ". Scotch on the rocks    Rs:120    "+quantity+"     	"+quantity*120+"\n";
						break;
					}
					case 5: {
						nod++;
						System.out.println("You selected Beer ");
						System.out.println("Enter quantity");
						quantity=sc.nextInt();
						price=price+(quantity*140);
						selectedItem +=nod + ". Beer                   Rs:140    "+quantity+"         "+quantity*140+"\n";
						break;
					}
					
					default: {
						System.out.println("Drink is not available!");
					}
				}
				System.out.println("Do you want to add more items in Drinks: ");
				System.out.println("enter (y) to continue,any other to exit from Drinks");
			    choice5=sc.next();
				
				}while(choice5.equalsIgnoreCase("y"));
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
		double cgst=(2.5/100)*price;
		double scharge=(5.0/100)*price;
		System.out.println("\nYour Selected Items:");
		System.out.println("NO.    Item Name          Price | Quantity| total-Item-price");
		System.out.println(selectedItem);
		System.out.println("                  Service charge(5%)             "+scharge);
		System.out.println("                          CGST(2.5%)             "+cgst);
		System.out.println("                          SGST(2.5%)             "+cgst);
		
		price=price+(2*cgst)+scharge;
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Total Items: " + nod +"              Total cost:       Rs:"+price);
		
}}
