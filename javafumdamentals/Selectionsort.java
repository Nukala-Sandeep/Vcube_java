package com.javafumdamentals;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int[] arr= {9,2,4,5,3,1,6,8,7,9};
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(arr));
		int count=0;
		int count1=0;
		
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			count++;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
					
					
				}
				count1++;
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
		
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(count+", "+count1);
	}

}
