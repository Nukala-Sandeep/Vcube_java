package com.gut;

import java.util.Arrays;

public class Day3insertionsort {

	public static void main(String[] args) {
        int[] arr= {12,11,13,5,6,23,54,0,23,543};
        int temp=0;
        for(int i=1;i<arr.length-1;i++) {
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
