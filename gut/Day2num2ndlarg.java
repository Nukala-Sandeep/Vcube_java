package com.gut;

import java.util.Arrays;

public class Day2num2ndlarg {

	public static void main(String[] args) {
		int[] arr= {12, 45, 67, 23, 89, 54};
		int k=2;
		
		int kmax=0;
		while(k--!=0) {
			int max=0;
			 for(int i=0;i<arr.length;i++) {
				 if(arr[i]>max) {
					 max=arr[i];
					 
				 }
				 				 
			 }
			 for(int j=0;j<arr.length;j++) {
				 if(arr[j]==max) {
					 kmax=arr[j];
					 arr[j]=-1;
					break;
				 }
			 }

			 
		}
		System.out.println(kmax);
		System.out.println(Arrays.toString(arr));
	}

}




