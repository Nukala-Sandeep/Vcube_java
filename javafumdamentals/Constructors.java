package com.javafumdamentals;

public class Constructors {
	
	int rollno;
	String name;
	int age;
	public Constructors() {
		this(1);
		System.out.println("no-arg ");
	}
	public Constructors(int rollno) {
		this(rollno,"Unknown");
		System.out.println("1-arg ");
	}
	public Constructors(int rollno,String name) {
		this(rollno,name,20);
		System.out.println("2-arg ");
	}
	
	public Constructors(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("Roll no: "+rollno);
		System.out.println("Name :"+name);
		System.out.println("Age: "+age);
		System.out.println("************************************************************");
	}
	public static void main(String[] args) {
		Constructors c1=new Constructors();
				c1.show();
		Constructors c2=new Constructors(2,"Sandeep");
				c2.show();
		Constructors c3=new Constructors(3,"Hartik",23);
				c3.show();
	}
	

}
