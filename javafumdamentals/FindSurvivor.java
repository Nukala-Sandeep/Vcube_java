package com.javafumdamentals;

import java.util.Arrays;

public class FindSurvivor {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
		}
		int j=0;
		double ans=0;
		while(Math.pow(2, j)<100) {
			ans=100-Math.pow(2, j);
			j++;
		}
		double rem=(ans*2)+1;
		System.out.println(--j);
		System.out.println((int)rem);
		System.out.println(Arrays.toString(arr));
//		int b=0;
//		boolean flag = true;
//		int start=0;
//		while (flag) {
//			int n = arr.length;
//			int[] a;
//			if(n%2==0) {
//				 a = new int[(n / 2)];
//			}else  {
//				 a = new int[(n / 2)+1];
//			}
//			int k = 0;
//			
//			for (int i = start; i < n; i+=2) {
//				a[k]=arr[i];
//			     k++;
//			}
//			System.out.println("  ");
//			System.out.println(Arrays.toString(a));
////			System.out.println(arr.length);
////			System.out.println(a.length);
////			b++;
//			if(a[a.length-1]==arr[arr.length-1] ) {
//				start=1;
////				System.out.println("a: "+a[a.length-1]);
////				System.out.println("arr: "+arr[arr.length-1]);
//			}else {
//				start=0;
//			}
//			
//			n=k;
//			k=0;
//			
//			if (a.length == 1) {
//				flag = false;
//			}
//			
//			arr=a;
//			a= null ;
//		}
	}

}
