package com.javafumdamentals;

public class InstanceExp {
	 static int sid=1;
	 String sname;
	 double fee;
	
	 static {
		 InstanceExp IE=new InstanceExp();
		 IE.show();
		 
	 }
	void show() {
		sname="Chaitra";
		fee=27000;
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(fee);
		display();
	}
	void display() {
		sid++;
		sname="Ravi";
		fee=25000.0;
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(fee);
		student3();
	}
	void student3() {
		sid++;
		sname="Sandeep";
		fee=27000.0;
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(fee);
		student4();
	}
	void student4() {
		sid++;
		sname="Jhanavi";
		fee=30000.0;
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(fee);
	}
	public static void main(String[] args) {
		
	}

}
