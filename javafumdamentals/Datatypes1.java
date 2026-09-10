package com.javafumdamentals;
import java.math.BigInteger;
import java.math.BigDecimal;
public class Datatypes1 {
	BigInteger a=new BigInteger("999999999999");
	BigInteger b=new BigInteger("111111111111");
	BigDecimal c=new BigDecimal(123456.78);
	BigDecimal d=new BigDecimal("23415.55");
      void add1() {
    	  System.out.println("Addition!");
    	  System.out.println(a.add(b));
    	  System.out.println(c.add(d));
    	  
    	  
    	  System.out.println("*********************************************************************************************************************************");
      }
      void multiply1() {
    	  System.out.println("Multiplication!");
    	  System.out.println(a.multiply(b));
    	  System.out.println(c.multiply(d));
      }
	public static void main(String[] args) {
		Datatypes1 dt=new Datatypes1();
		dt.add1();
		dt.multiply1();
	}

}
