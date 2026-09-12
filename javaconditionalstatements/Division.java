package com.javaconditionalstatements;

public class Division {
	public int divide(int dividend,int divisor) {
		if(dividend==Integer.MIN_VALUE && divisor==-1) {
			return Integer.MAX_VALUE;
		}
		long num=Math.abs((long)dividend);
		long div=Math.abs((long)divisor);
		boolean negative=(dividend<0)!=(divisor<0);
		 long result=0;
		 
		 while(num>=div) {
			 long temp=div;
			 long mul=1;
			  while(num>=temp+temp) {
				  temp=temp+temp;
				  mul=mul+mul;
			  }
			  num=num-temp;
			  result=result+mul;
		 }
		 if(negative) {
			 result = -result;
			 
		 }
		 
		 return (int)result;
		
	}

	public static void main(String[] args) {
		Division d=new Division();
		int a=12;
		int b=2;
		
		System.out.println(d.divide(a,b));
	}

}
