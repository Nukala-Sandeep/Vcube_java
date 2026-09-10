package com.javafumdamentals;
class  Publicc{
	public int a=10;
	public void display() {
		System.out.println(a);
	}
}
class AccPublic {
	

	public static void main(String[] args) {
		Publicc p=new Publicc();
		System.out.println(p.a);
		p.display();
	}

}
