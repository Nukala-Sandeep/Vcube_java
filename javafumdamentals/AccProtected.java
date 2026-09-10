package com.javafumdamentals;

class Parent {
protected int a=100;
protected void display() {
	System.out.println(a);
}
}
class AccProtected extends Parent{
	void test() {
		System.out.println(a);
		int a=200;
		System.out.println(a);
		display();
	}
	
	
	public static void main(String[] args) {
		AccProtected ap = new AccProtected();
		ap.display();
		ap.test();
		
	}

}

