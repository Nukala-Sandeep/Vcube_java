package com.javafumdamentals;

import java.util.Arrays;

public class GutExam {
	static int nthLargestnum(int[] arr,int k) {
		int max=arr[0];
		int nthmax=arr[0];
		if(arr.length<2) {
			return arr[arr.length-1];
		}
		
		while(k--!=0) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
			}}
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==max) {
					nthmax=max;
					arr[j]=0;
					max=0;
					break;
					
				}
			}
			
	}
		return nthmax;
	}
	
	static int[] arraySumkelements(int[] arr,int k) {
		int[] newArr=new int[arr.length];
		if(k<1) {
			return arr;
		}
		if(k>=arr.length) {
	    	return newArr;
	    }
		
	    int left=1;
	    int right=left+k-1;
	    int n=0;
	    
	    while(n<arr.length) {
	    	int sum=0;
	    if(right<arr.length && left<=right  && left < arr.length) {
	    	
	    	for(int i=left;i<=right;i++) {
	    	sum=sum+arr[i];
	    	}
	    	newArr[n]=sum;
	    }else if (left<arr.length &&  (left+k-1)>=arr.length)  {
	    	right=right%arr.length;
	    	
	    	for(int i=left;i<arr.length;i++) {
	    		sum +=arr[i];
	    	}
	    	for(int i=0;i<=right;i++) {
	    		sum +=arr[i];
	    	}
	    	System.out.println(sum);
	    	
	    	newArr[n]=sum;
	    }else if(left>=arr.length) {
	    	left=left%arr.length;
	    	right=left+k-1;
	    	for(int i=left;i<=right;i++) {
		    	sum=sum+arr[i];
		    	
		    	}
	    	System.out.println(sum);
		    	newArr[n]=sum;
	    }
	    n++;
	    left++;
	    right++;
	    
	    }
	    
		return newArr;
	}
	
	public static void main(String[] args) {
//		int x=4;
//		int y= 7;
//		int z=3;
//		x +=++y - z--;
//		y=x++ + --z - --y;
//		z+= --x+ y++ - ++z;
//		System.out.println(x+" "+y+" "+z);
//		**************************************************************
//		int[] a= {2,4,6,8};
//		int i=0;
//		a[i]++;
//		++a[i++];
//		a[i]+=a[i-1]++;
//		
//		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
//		System.out.println("**********************************************************************************************************");
//		int[] a= {5,10,15,20};
//		int i=3;
//		a[i]--;
//		a[--i]++;
//		a[i--]=--a[i];
//		
//		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
		
//		int[] arr= {11,8,3,4,15,60};
//		int k=5;
//		 int num=nthLargestnum(arr,k);
//		 System.out.println("nth largest num: "+num);
		int[] arr= {11,8,3,4,15,60};
		int k=10;
		int[] arr2=new int[arr.length];
		if(k<arr.length) {
		 arr2=arraySumkelements(arr,k);
		 System.out.println(Arrays.toString(arr2));
		}
		else {
			System.out.println("k is Greater than array size!!");
		}
			}
		
	}


