package com.loops;

public class CheckPrimeArray {

	public static void main(String[] args) {
		int[] productIds = {12, 17, 21, 23, 31, 40, 44, 47};
		
		for(int i=0;i<productIds.length;i++) {
			boolean status=true;
			int n=productIds[i];
			if (n >=2) {

				for (int j = 2; j <= n / 2; j++) {
					if (n % j == 0) {
						status = false;
						break;
					}
				}
				if (status) {
					System.out.println(n);
				}
			}
		}
	}

}
