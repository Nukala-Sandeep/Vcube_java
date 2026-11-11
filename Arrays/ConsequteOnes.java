package com.Arrays;

public class ConsequteOnes {

	public static void main(String[] args) {
		int[] arr= {1,1,0,1,1,1};
		int maxCount=1;
		int count=1;
		
		int start=0;
		int end=0;
		int tempStart=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}else {
				tempStart=i;
				count=1;
			}
			if(count>maxCount) {
				maxCount=count;
				start=tempStart;
				end=i;
			}
		}
		System.out.println("Max Count: "+maxCount);
		System.out.println("indexes: "+start+","+end);

	}

}
