package com.javafumdamentals;

public class Employee2 {
	void displayEname() {
		String name="Sandeep";
		System.out.println("Name: "+name);
	}
	void displayEid() {
		int id=12;
		System.out.println("Employee ID: "+id);
	}
	void displayDepartment() {
		String dept="Manager";
		System.out.println("Manager: "+dept);
	}
	void dislaysalary() {
		double sal=50000.0;
		System.out.println("Salary: "+sal);
	}
	void displayexp() {
		int exp=2;
		System.out.println("Experiance: "+exp);
	}
	void displayCname() {
		String cName="Google";
		System.out.println("Company name: "+cName);
	}
	public static void main(String[] args) {
		Employee2 e=new Employee2();
		e.displayEname();
		e.displayEid();
		e.displayDepartment();
		e.dislaysalary();
		e.displayexp();
		e.displayCname();
		
	}
	
}
