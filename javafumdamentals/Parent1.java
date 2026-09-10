package com.javafumdamentals;

public class Parent1 {
    Parent1() {
        System.out.println("Parent");
    }
    public static void main(String[] args) {
    	
    }
    
}

class Child1 extends Parent1 {
    Child1() {
        this(10);
//        super();
        System.out.println("Child");
    }

    Child1(int x) {
        System.out.println("Child(int)");
    }
    public static void main(String[] args) {
    	Child1 c=new Child1();
    }
}