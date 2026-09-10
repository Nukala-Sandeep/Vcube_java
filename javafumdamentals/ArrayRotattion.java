package com.javafumdamentals;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotattion {
	static void rotateArray(int[] arr,int start,int end) {
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rotations: ");
		int r=sc.nextInt();
		int[] arr= {8,7,6,5,4,3,2,1};
		int start=0;
		int end=arr.length-1;
		r=r%arr.length;
		rotateArray(arr,start,end);
		rotateArray(arr,start,r-1);
		rotateArray(arr,r,end);
		System.out.println(Arrays.toString(arr));
	}

}
