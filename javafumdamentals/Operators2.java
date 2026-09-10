package com.javafumdamentals;

public class Operators2 {
	static int add(int a,int b) {
		while(b!=0) {
			int carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		return a;
	}

	public static void main(String[] args) {
		int a=10;
		int b=20;
		double d=3.5;
		int result=(int)(a+d);
		System.out.println("Difference is"+b+a);
		System.out.println("Difference is"+(b-a));
		System.out.println("Difference is"+b*a);
		System.out.println("Difference is"+b/a);
		System.out.println("Difference is"+b%a);
		
		int a1 = Integer.parseInt(args[0]);
        int b1 = Integer.parseInt(args[1]);
        
        System.out.println(a1 + b1);
        System.out.println(add(15,3));
        System.out.println("result Add: "+result );
        System.out.println("sub: " +(result -=2.5));
        System.out.println("mul: "+(result *=3.5));
        System.out.println(("div: "+(result /=2.5)));
		System.out.println("rem: "+(result %=2.1));
		System.out.println(+(-(-(-a))));
	}

}
