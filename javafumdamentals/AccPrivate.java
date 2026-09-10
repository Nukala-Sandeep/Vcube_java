package com.javafumdamentals;

import com.javaintro.Product;

class Privatee{
//	private Privatee() {
//		System.out.println("Private Constructor Called!");
//	}
	private int c=20;
	public  void display() {
		System.out.println(c);
	}
}

 class AccPrivate {
	 private AccPrivate() {
		 System.out.println("Constructor called!");
	 }
     private int a=10;
     private void display() {
    	 System.out.println(a);
     }
	public static void main(String[] args) {
		AccPrivate p=new AccPrivate();
		Privatee pt=new Privatee();
		p.display();
//		System.out.println(pt.c);
		pt.display();
		System.out.println("***********************************************************************************");

		Product p2=new Product();     //class product is  public , public can be accessed in any package or class etc.
		p2.productId=124;             //it is declared as public int productId, public can be accessed in any package or class etc.
//		p2.productName="Chocolate";   //it shows error as default variable or method or block is accessed only in same package but not in other packages.
//		p2.productPrice=10.00;
//		p2.productInfo="It is a snak";
		
		p2.display();
		p2.show();
		
		
		System.out.println("***********************************************************************************");

		LibraryBook lb1=new LibraryBook();
		lb1.libraryName="Central Library";
		lb1.librarianName="Shashank";
		lb1.bookId=1;
		lb1.bookTitle="JAVA";
		lb1.authorName="James Gosling";
		lb1.availableCopies=30;
		lb1.displayBookDetails();
		lb1.displayLibraryDetails();
	    

	}

}
