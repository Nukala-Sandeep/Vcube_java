package com.gut;

import java.util.Arrays;

public class Day1Bubblesort {

	public static void main(String[] args) {
		int[] arr= {5,3,8,4,2,10,1};
		
		for (int i=0;i<arr.length-1;i++) {
			boolean flag=false;;
			for(int j=0;j<arr.length-1-i;j++) {	
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
