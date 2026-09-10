package com.gut;

import java.util.Arrays;

public class Day1IndexOfTarget {
	static int indexOfTarget(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int target=40;
		System.out.println(indexOfTarget(arr, target));
		System.out.println(Arrays.binarySearch(arr,target));

	}

}
 