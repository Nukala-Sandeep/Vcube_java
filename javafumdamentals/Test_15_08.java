package com.javafumdamentals;

public class Test_15_08 {
	static int count=0;
	int y=3;
	static int x=2;
//	static {
//		x *=4;
//	}
	{
		y +=x;x +=y;
		count++;
	}

	public static void main(String[] args) {
		Test_15_08 t1=new Test_15_08();
		Test_15_08 t2=new Test_15_08();
		System.out.println(x+" "+t1.y+" "+t2.y);
		System.out.println("count: "+count);

	}

}
