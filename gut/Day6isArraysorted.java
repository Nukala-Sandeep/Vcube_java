package com.gut;

public class Day6isArraysorted {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag=false;
				break;
			}
		}
		System.out.println(flag);
	}

}
