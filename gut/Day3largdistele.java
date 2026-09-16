package com.gut;

public class Day3largdistele {

	public static void main(String[] args) {
		int[] arr= {10,20,4,45,99};
		int n=3;
		int max=0;
		while(n-->0) {
			max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			} for(int j=0;j<arr.length;j++) {
				if(arr[j]==max) {
					arr[j]=-1;
				}
			}
			
		}
		System.out.println(max);

	}

}
