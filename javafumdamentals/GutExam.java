package com.javafumdamentals;

public class GutExam {

	public static void main(String[] args) {
//		int x=4;
//		int y= 7;
//		int z=3;
//		x +=++y - z--;
//		y=x++ + --z - --y;
//		z+= --x+ y++ - ++z;
//		System.out.println(x+" "+y+" "+z);
//		**************************************************************
//		int[] a= {2,4,6,8};
//		int i=0;
//		a[i]++;
//		++a[i++];
//		a[i]+=a[i-1]++;
//		
//		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
		
		int[] a= {5,10,15,20};
		int i=3;
		a[i]--;
		a[--i]++;
		a[i--]=--a[i];
		
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
		
	}

}
