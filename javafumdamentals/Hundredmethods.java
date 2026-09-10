package com.javafumdamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

class Addition {
	int a;
	int b;
	void add(int a,int b) { 
	int c=a+b;
	System.out.println("sum is :"+c );
	}
}

public class Hundredmethods {

	void c1name(String name1) {
		System.out.println("Customer1 name:"+name1);
	}
	void c1age(int age) {
		System.out.println("Customer1 age is: "+age);
	}
	void c1product1(String product1) {
		System.out.println("Product: "+product1);
	}
	void c1cost1(double cost1) {
		System.out.println("Cost of product1: "+cost1);
	} 
	void c1gender(char gender1) {
		System.out.println("Customer1 gender: "+gender1);
	}
	/********************************************************************************************************/
	void anime1name(String animeName1) {
		System.out.println("Anime Details!!!");
		System.out.println("Anime1 name : "+animeName1);
	}
	void animeage(int animeAge) {
		System.out.println("Age of Anime: "+animeAge);
	}
	void totalEpisodes(int episodes) {
		System.out.println("Total episodes in Anime: "+episodes);
	}
	void epsodeCost(double epcost) {
		System.out.println("cost of making one episode: "+epcost);
	}
	void isAiring(boolean airing) {
		System.out.println("The anime is airing: "+airing);
	}
	/*********************************************************************************************************/
	void charactorName(String chName) {
		System.out.println("Charactor Details!!!!!!!!!");
		System.out.println("Charactor Name: "+chName);
	}
	void chractorGender(char chGender) {
		System.out.println("charactor gender is: "+chGender );
	}
	void charactorAge(int chage) {
		System.out.println("Age of the Charactor is: ");
	}
	void charactorRole(String role) {
		System.out.println("Charactor role is: "+role);
	}
	/****************************************************************************************************************/
	void stdName() {
		String sname="sandeep";
		System.out.println("Student Details!!");
		System.out.println("Student Name: "+sname);
	}
	void StdId() {
		int sid=102;
		System.out.println("Student Id: "+sid);
	}
	void stdBranch() {
		String branch="CSM";
		System.out.println("Branch: "+branch);
	}
	void stdpersentage() {
		double percentage=89.50;
		System.out.println("Persentage: "+percentage);
	}
	void stdfee() {
		float fee=55000.50f;
		System.out.println("Student fee: "+fee);
	}
	void stdGender() {
		Character sgender='M';
		System.out.println(" Stubent Gender: "+sgender);
	}
	/***************************************************************************************************************/
	
	void bigInt() {
		BigInteger bi=new BigInteger("12345432");
		System.out.println("BigInteger : "+bi);
	}
	void bigInt2(BigInteger bi2) {
		System.out.println("BigInteger2: "+bi2);
	}
	void bidDecimal(BigDecimal bd) {
		System.out.println("BigDecimal: "+bd);
	}
	void stringbuf(StringBuffer sb) {
		System.out.println("StringBuffer: "+sb);
	}
	void integer2(Integer i2 ) {
		System.out.println("Integer2: "+i2);
	}
	void shot() {
		Short sh=12;
		System.out.println("Short: "+sh);
	}
	void byt() {
		Byte by=23;
		System.out.println("Byte: "+by);
	}
	void long2() {
		Long l2=9912520902l;
		System.out.println("Long: "+l2);
	}
	void addition() {
		Addition ad=new Addition();
		ad.add(10, 20);
		
	}
	void subtraction() {
		Integer i=30;
		Integer i2=10;
		Integer i3=i+i2;
		System.out.println("Difference: "+i3);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hundredmethods hm=new Hundredmethods();
		System.out.println("Enter customer1 name:");
		String name1=sc.next();
		
		System.out.println("Enter customer1 age:");
		int age=sc.nextInt();
		
		System.out.println("enter customer gender: ");
		char gender1=sc.next().charAt(0);
		
		System.out.println("Enter the product1: ");
		String product1=sc.next();
		
		System.out.println("Enter cost of product: ");
		double cost1=sc.nextDouble();
		
		hm.c1name(name1);
		hm.c1age(age);
		hm.c1gender(gender1);
		hm.c1product1(product1);
		hm.c1cost1(cost1);
		System.out.println("*********************************************************************************");
		
		System.out.println("Enter the Anime name: ");
		String animeName1=sc.next();
		
		System.out.println("Enter the Age of anime: ");
		int animeAge=sc.nextInt();
		
		System.out.println("Enter total episodes in anime : ");
		int episodes=sc.nextInt();
		
		System.out.println("Enter cost for one episode: ");
		double epcost=sc.nextDouble();
		
		System.out.println("Enter is the anime still airing (true/false): ");
		boolean airing=sc.nextBoolean();
		
		hm.anime1name(animeName1);
		hm.animeage(animeAge);
		hm.totalEpisodes(episodes);
		hm.epsodeCost(epcost);
		hm.isAiring(airing);
		System.out.println("**************************************************************************************************");
		
		System.out.println("Enter charactor name: ");
		String chName=sc.next();
		 
		System.out.println("Charactor gender: ");
		char chGender=sc.next().charAt(0);
		
		System.out.println("Enter charactor age: ");
		Integer chage=sc.nextInt();
		
		System.out.println("Enter the role: ");
		String role=sc.next();
		
		hm.charactorName(chName);
		hm.chractorGender(chGender);
		hm.charactorAge(animeAge);
		hm.charactorRole(role);
		System.out.println("**************************************************************************************************************");
		
		hm.stdName();
		hm.StdId();
		hm.stdBranch();
		hm.stdpersentage();
		hm.stdfee();
		hm.stdGender();
		System.out.println("*****************************************************************************************************************");
		
		System.out.println("Enter BigInteger: ");
		BigInteger bi2=sc.nextBigInteger();
		
		System.out.println("Enter BigDecimal: ");
		BigDecimal bd=sc.nextBigDecimal();
		
		
		StringBuffer sb=new StringBuffer("Yaswanth");
		
		hm.bigInt();
		hm.bigInt2(bi2);
		hm.bidDecimal(bd);
		hm.stringbuf(sb);
		Integer i2=new Integer(21);
		hm.integer2(i2);
		hm.shot();
		hm.byt();
		hm.long2();
		hm.addition();
		hm.subtraction();
		
	}

}
