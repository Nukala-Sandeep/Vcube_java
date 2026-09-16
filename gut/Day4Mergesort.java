package com.gut;

import java.util.Arrays;

public class Day4Mergesort {
	static void div(int[] arr) {
		if(arr.length==1) {
			return ;
		}
		
		int[] leftarr=new int[arr.length/2] ;
		int[] rightarr=new int[arr.length-leftarr.length];
		int i;
		for(i=0;i<leftarr.length;i++) {
			leftarr[i]=arr[i];
		}
		for(int j=0;j<rightarr.length;j++) {
			rightarr[j]=arr[i];
			i++;
		}
		div(leftarr);
		div(rightarr);
		merge(arr,leftarr,rightarr);
	}
		static void merge(int[] arr,int[] leftarr,int[] rightarr) {
			int i=0;
			int j=0;
			int k=0;
			while(i<leftarr.length && j<rightarr.length) {
				if(leftarr[i]<rightarr[j]) {
					arr[k++]=leftarr[i++];
				}else {
					arr[k++]=rightarr[j++];
				}
				
				
			}
			while(i<leftarr.length) {
				arr[k++]=leftarr[i++];
			}
			while(j<rightarr.length) {
				arr[k++]=rightarr[j++];
			}
		}
	
	public static void main(String[] args) {
		int[] arr= {1,4,76,43,77,43,98,11};
		div(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
