package com.javafumdamentals;

class Student1{
	int sid;
	String name;
	String branch;
	Address address;
}
class Address{
	String city;
	String state;
	String country;
}
public class AutoboxingAndAutoUnboxing {

	public static void main(String[] args) {
//		Student1 s1=new Student1();
//		s1.sid=101;
//		s1.name="Sandeep";
//		s1.branch="CSM";
//		s1.address=new Address();
//		s1.address.city="Hyderabad";
//		s1.address.state="Telangana";
//		s1.address.country="India";
//		System.out.println("sid: "+s1.sid);
//		System.out.println("name: "+s1.name);
//		System.out.println("Branch: "+s1.branch);
//		System.out.println("city: "+s1.address.city);
//		System.out.println("State: "+s1.address.state);
//		System.out.println("Country: "+s1.address.country);
//		System.out.println(s1.address);
//		
		int a=0123;
		System.out.println(a);
		double l=0x123;
		int b=a*(int)l;
		System.out.println(l);
		System.out.println(l*a);
		char c='0';
		System.out.println(c);
		System.out.println(b);
		System.out.println(l=b);
		
	}

}
