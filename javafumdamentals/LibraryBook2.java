package com.javafumdamentals;
import java.util.Scanner;
public class LibraryBook2 {
	int bookid;
	String bookname;
	String authorname;
	int availablecopies;
	static String libraryname;
	static String librarian;
	static {
		System.out.println("Wellcome to LibraryBook2 !");
	}
	void displaybookdetails(){
		System.out.println("Book Id: "+bookid);
		System.out.println("Book Name: "+bookname);
		System.out.println("Author Name: "+authorname);
		System.out.println("Available Copies: "+availablecopies);
		System.out.println("**********************************************************************************************************************************");
		
	}
	void issuebook() {
		availablecopies=availablecopies-1;
		
	}
	void displaylibrarydetails(){
		System.out.println("Library Name: "+libraryname);
		System.out.println("librarian Name: "+librarian);
	}
	static void changelibrarian() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new librarian:");
		librarian=sc.nextLine();
	}

	public static void main(String[] args) {
		LibraryBook2 lb1=new LibraryBook2();
		libraryname="Central Library";
		librarian="Rahul";
		lb1.bookid=1;
		lb1.bookname="Hello World";
		lb1.authorname="Surender";
		lb1.availablecopies=20;
		lb1.displaylibrarydetails();
		
		lb1.displaybookdetails();
		lb1.issuebook();
		lb1.displaybookdetails();
		
		LibraryBook2 lb2=new LibraryBook2();
		lb2.bookid=2;
		lb2.bookname="Future is AI";
		lb2.authorname="Alex";
		lb2.availablecopies=10;
		lb2.displaylibrarydetails();
		lb2.displaybookdetails();
		
		LibraryBook2 lb3=new LibraryBook2();
		lb3.bookid=3;
		lb3.bookname="One Piece";
		lb3.authorname="oda";
		lb3.availablecopies=100;
		lb3.issuebook();
		lb3.issuebook();
		lb3.issuebook();
		lb3.issuebook();
		lb3.issuebook();
		changelibrarian();
		lb3.displaylibrarydetails();
		lb3.displaybookdetails();
	}

}
