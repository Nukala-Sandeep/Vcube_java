package com.javafumdamentals;

public class Student {
	String sname;
	int age;
	int admissionyear;
	String rollno;
	long mobile;
	double attendancepercentage;
	double fees;
	char grade;
	char pass_fail;
	long studentID;
	String feepaid;

	public static void main(String[] args) {
		Student s1=new Student();
		s1.sname="Sandeep";
		s1.age=22;
		s1.admissionyear=2002;
		s1.rollno="22Q91A66A6";
		s1.mobile=9912520007l;
		s1.attendancepercentage=75.5;
		s1.fees=50000.0;
		s1.grade='A';
		s1.pass_fail='P';
		s1.studentID=9912909009293848l;
		s1.feepaid="cleared";
		System.out.println("student name: "+s1.sname);
		System.out.println("Age: "+s1.age);
		System.out.println("admissionyear:"+s1.admissionyear);
		System.out.println("rollno: "+s1.rollno);
		System.out.println("mobile: "+s1.mobile);
		System.out.println("attendancepercentage: "+s1.attendancepercentage);
		System.out.println("fee: "+s1.fees);
		System.out.println("grade: "+s1.grade);
		System.out.println("pass/fail: "+s1.pass_fail);
		System.out.println("StudentId: "+s1.studentID);
		System.out.println("fee paid: "+s1.feepaid);

	}

}
