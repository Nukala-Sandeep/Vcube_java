package com.javafumdamentals;

public class Test {

    final int x;

    Test() {
        this(10);
    }

    Test(int x) {
        this.x = x;
    }

   
    public static void main(String[] args) {
    	Test t=new Test();
       System.out.println(t.x);
    }
}
