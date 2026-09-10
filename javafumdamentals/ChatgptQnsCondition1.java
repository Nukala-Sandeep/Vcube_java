package com.javafumdamentals;

public class ChatgptQnsCondition1 {
	void asc(int a,int b,int c) {
	 if(a>=b && a>=c) {
		
		 if(b<=c) {
			 System.out.print(b+" "+c);
		 }else {
			 System.out.print(c+" "+b);
		 }
		 System.out.print(" "+a);
	 }else if(b>c) {
		
		 if(a<c) {
			 System.out.print(a+" "+c);
		 }else {
			 System.out.print(c+" "+a);
		 }
		 System.out.println(" "+b);
	 }else {
		 
		 if(a<b) {
			 System.out.print(a+" "+b);
		 }else {
			 System.out.print(b+" "+a);
		 }
		 System.out.println(" "+c);
	 }
	}
	void middleNum(int a,int b,int c) {
		if(a>=b && a>=c ) {
			if(b>c) {
				System.out.println("middle num is "+b);
			}
			else {
				System.out.println("middle num is "+c);
			}
		}else if(b>c) {
			if(a>c) {
				System.out.println("middle num is "+a);
			}else {
				System.out.println("middle num is "+c);
			}
		}else {
			if(a>b) {
				System.out.println("middle num is "+a);
			}else {
				System.out.println("middle num is "+b);
			}
		}
	}
	void productSign(int a,int b) {
		if(a==0 || b==0) {
			System.out.println("0");
		}else if((a<0 && b>0 )||(a>0 && b<0) ) {
			System.out.println("negative");
		}else {
			System.out.println("positive");
		}
	}
	void maxof4(int a,int b,int c,int d) {
		if(a>b && a>c && a>d){
			System.out.println(a+" is max number.");
		}else if(b>c && b>d) {
			System.out.println(b+" is max number.");
		}else if(c>d) {
			System.out.println(c+" is max number.");
		}else {
			System.out.println(d+" is max number.");
		}
	}
	public static void main(String[] args) {
		ChatgptQnsCondition1 c=new ChatgptQnsCondition1();
		c.asc(11, 10, 110);
		c.middleNum(23,33, 23);
		System.out.println(-(-2));
		c.productSign(-1, 0);
		c.productSign(0, 2);
		c.productSign(12, -2);
		c.productSign(-1, -12);
		c.maxof4(220, 220,20, 20);
	}

}
