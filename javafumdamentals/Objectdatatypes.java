package com.javafumdamentals;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Objectdatatypes {

	public static void main(String[] args) {
		BigInteger a=new BigInteger("1235674844");
		BigInteger a1=new BigInteger("987654345");

		BigDecimal b=new BigDecimal(9835426748.23);
		BigDecimal b1=new BigDecimal("8647363456.5");
        
		System.out.println("BigInteger Sum: "+a.add(a1));
		System.out.println("BigDecimal sum: "+b.add(b1));
	}

}
