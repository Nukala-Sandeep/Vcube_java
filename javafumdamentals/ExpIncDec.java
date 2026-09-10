package com.javafumdamentals;

public class ExpIncDec {
	static void method1() {
		int x = 2;
		int y = 3;

		int z = x++ - --y - x + y - x-- + y--;
		System.out.println("x= "+x+" , y= "+y+" , z= "+z);
	}
	static void method2() {
		int x = 0;
		int y = -1;

		int z =  (x + y) - --x + (x + 1) - y-- + x--;
		System.out.println("x= "+x+" , y= "+y+" , z= "+z);
	}
	static void method3() {
		int x = 5;
		int y = 4;

		int z =   (int)Math.pow(x,2) + (int)Math.pow(--y,2) -(int)Math.pow(x++,2)  - y++ + x-- + y--;;
		System.out.println("x= "+x+" , y= "+y+" , z= "+z);
	}
	static void method4() {
		int x = -2;
		int y = -5;

		int z = (x++ * 2) - (y - 2) + ((x--)- 4) + (y++ * 4);
		System.out.println("x= "+x+" , y= "+y+" , z= "+z);
	}
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}

}
