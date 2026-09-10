package com.javafumdamentals;

import java.util.Arrays;

public class Mergsort {

	public static void main(String[] args) {
		int[] arr= {6,4,5,3,7};
		divide(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));

	}
	static void divide(int[] arr) {
		if(arr.length==1) {
			return ;
		}
		int[] left=new int[arr.length/2];
		int[] right=new int[arr.length-left.length];
		int i;
		for(i=0;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=arr[i];
			i++;
		}
		divide(left);
		divide(right);
		merge(arr,left,right);
	}
	static void merge(int[] arr,int[] left,int[] right) {
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				arr[k++]=left[i++];
			}else {
				arr[k++]=right[j++];
			}
			
		}
		while(i<left.length) {
			arr[k++]=left[i++];;
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
	}

}
