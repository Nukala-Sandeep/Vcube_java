package com.javafumdamentals;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr= {1,2,5,3,8,4};
		int temp;
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false;
			count++;
			for(int j=0;j<arr.length-1-i;j++) {
				count1++;
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(Arrays.toString(arr));

	}

}
