package com.javafumdamentals;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {
		int[] arr= {3,1,5,2,6,4};
		int temp=0;
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			int j=i;
			
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
