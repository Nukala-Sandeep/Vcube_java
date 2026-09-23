package com.loops;
//Print only the transaction IDs whose number and reversed number are both prime.
public class CheckPrimeReversePrime {

	public static void main(String[] args) {
		int[] transactions = {13, 17, 23, 31, 37, 41, 47};
		for(int i=0;i<transactions.length;i++) {
			int n=transactions[i];
			int revnum=revNum(n);
			if(isPrime(n) && isPrime(revnum)) {
				System.out.println(n);
			}
		}
	}

	static boolean isPrime(int n) {
		boolean flag=true;
		if(n<2) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

	static int revNum(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		return sum;
	}

}
