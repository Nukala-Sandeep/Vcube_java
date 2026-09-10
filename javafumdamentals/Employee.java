package com.javafumdamentals;

public class Employee {
	int empId;
	String ename;
	double sal;
	int exp;
	char grade;
	String perminentStatus;
	static {
		System.out.println("Employee Details!!");
		System.out.println();
	}
	void display() {
		System.out.println("Employe Id: "+empId);
		System.out.println("Employe Name: "+ename);
		System.out.println("Salary: "+sal);
		System.out.println("Experiance: "+exp);
		System.out.println("Grade: "+grade);
		System.out.println("Perminent Status: "+perminentStatus);
		System.out.println("************************************************************************************************************************************");
		System.out.println();
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
			e1.empId=1;
			e1.ename="Vinod";
			e1.sal=40000;
			e1.exp=1;
			e1.grade='A';
			e1.perminentStatus="No";
			e1.display();
			Employee e2=new Employee();
			e2.empId=2;
			e2.ename="Suresh";
			e2.sal=50000;
			e2.exp=3;
			e2.grade='A';
			e2.perminentStatus="Yes";
			e2.display();
			Employee e3=new Employee();
			e3.empId=3;
			e3.ename="Sandeep";
			e3.sal=45000;
			e3.exp=2;
			e3.grade='A';
			e3.perminentStatus="yes";
			e3.display();

	}

}
