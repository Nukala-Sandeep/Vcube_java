package com.javafumdamentals;

public class Assignment26_8 {
	Integer sid;
	String sname;
	Character gender;
	String branch;
	String college;
	void show() {
		System.out.println("Sid: "+sid);
		System.out.println("sname: "+sname);
		System.out.println("gender: "+gender);
		System.out.println("branch: "+branch);
		System.out.println("branch: "+college);
		System.out.println("******************************************************************************************************************************************");
	}
	public static void main(String[] args) {
		Assignment26_8 s1=new Assignment26_8();
		s1.sid=1;
		s1.sname="Sandeep";
		s1.gender='M';
		s1.branch="CSM";
		s1.college="MRCE";
		s1.show();
		Assignment26_8 s2=new Assignment26_8();
		s2.sid=2;
		s2.sname="Anil";
		s2.gender='M';
		s2.branch="CSM";
		s2.college="KITS";
		s2.show();
	}

}
