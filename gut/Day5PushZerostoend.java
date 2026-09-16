package com.gut;

import java.util.Arrays;

public class Day5PushZerostoend {

	public static void main(String[] args) {
		int[] arr= {0,1,0,2,3,0,7};
		int[] newarr=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				newarr[j++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0 && i!=arr.length-1) {
				int temp=arr[i];
				for(int k=i;k<arr.length-1;k++) {
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newarr));
	}

}
