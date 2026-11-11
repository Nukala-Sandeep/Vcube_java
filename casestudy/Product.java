package com.casestudy;

import java.util.Scanner;

public class Product {
	String productName;
	double price;
	int quantity;
 Product(String productName,double price,int quantity){
	 this.productName=productName;
	 this.price=price;
	 this.quantity=quantity;
	 
 }
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Products:");
		int noOfProducts=sc.nextInt();
		if(noOfProducts<1) {
			System.out.println("No products perchased.");
		}else {
			double sum=0;
			double totalprice=0;
			String billing="";
			for(int i=1;i<=noOfProducts;) {
				System.out.println("Enter Product "+i+" details ");
				System.out.println("Enter Product name:");
				String name=sc.next();
				System.out.println("Enter price of product:");
				double price=sc.nextDouble();
				if(price<1) {
					System.out.println("Enter valid Price:");
					continue;
				}
				System.out.println("Enter Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<1) {
					System.out.println("Enter valid quantity:");
					continue;
				}
				Product p=new Product(name,price,quantity);
				sum=sum+(price*quantity);
				billing+=i+".	"+name+"	     "+price+"	   "+quantity+" \n";
				i++;
			}
			double disc=0;
			totalprice=sum;
			if(sum>5000) {
				disc=(10/100.0)*sum; 
				totalprice=sum-disc;
				
			}
			System.out.println("PNO    ProductName    Price    quantity");
			System.out.println(billing);
			System.out.println("       discount      "+(-disc));
			System.out.println("----------------------------------------------------------");
			System.out.println("totalprice:           "+totalprice);
			
		}
		sc.close();
		System.out.println("\nThankyou for visiting ProductStore");
	}

}
