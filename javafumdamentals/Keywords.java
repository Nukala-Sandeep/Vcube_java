package com.javafumdamentals;

public class Keywords {
//	*******************************************************************************************************
	void primitiveDT(){
		byte a=12;
		
		short b=32767;
		
		int c= 2147483647;
		byte i=(byte)c;
		byte j=(byte)(a+i);
		int k=a+j;
		long d=9223372036854775807L;
		float e=1234.123f;
		double f=12.55;
		char g='G';
		int g1=g+2;
		boolean h=true;
		
		
		System.out.println("***********Premitive Data Types**********");
		if(c>0) {
			System.out.println("c is positive number");
		}else if(c<0) {
			System.out.println("c is negitive number");
		}else {
			System.out.println("c is 0");
		}
		a++;
		System.out.println("Byte a: "+a);
		System.out.println("Short b: "+b);
		c++;
		System.out.println("Int c: "+c);
		System.out.println("Int c to double: "+(double)c);
		System.out.println("Int c to char: "+(char)c);
		System.out.println("Byte i: "+i);
		System.out.println("Byte j: "+j);
		System.out.println("Byte k: "+k);
		d++;
		System.out.println("Long d: "+d);
		System.out.println("Float e: "+e);
		System.out.println("Double f: "+f);
		System.out.println("Double f to int: "+(int)f);
		System.out.println("Add: int + double: "+(k+f));
		System.out.println("Char g: "+g);
		System.out.println("Int g1: "+g1);
		System.out.println("Char g1: "+(char)g);
		System.out.println("lowercase g: "+(char)(g+32));
		System.out.println("Char after g: "+ ++g);
		System.out.println("ASCCI value of "+ g+": "+(int)g);
		System.out.println("boolean h:"+h);
	}
//************************************************************************
	
	/** static **/
//	static int count=0;
//	static int count1=0;
//	static{
//		count1++;
//	}
//	{
//		count++;
//	}
//	void Objcount() {
//		Keywords k1=new Keywords();
//		Keywords k2=new Keywords();
//		Keywords k3=new Keywords();
//		Keywords k4=new Keywords();
//		System.out.println(count);
//		System.out.println(count1);
//	}
	public static void main(String[] args) {
		Keywords k=new Keywords();
//		k.Objcount();
		k.primitiveDT();
	}

}
