package ArrayList;

import java.util.List;
import java.util.ArrayList;

class Book {
	int ID;
	String BookName,BookAuthor,BookPublisher;
	int BookCost;
public Book(int ID,String BookName,String BookAuthor,String BookPublisher,int BookCost) {
	this.ID = ID;
	this.BookName = BookName;
	this.BookAuthor = BookAuthor;
	this.BookPublisher = BookPublisher;
	this.BookCost = BookCost;
}
}

public class ArrayList8 {

	private static final boolean Book = false;

	public static void main(String[] args) {
		List<Book> l1 = new ArrayList<Book>();
		Book b1 = new Book(01,"Computer Network","Leena bhole","Prashant Publication",210);
		Book b2 = new Book(02,"Network Securiry","Dr.S.D.Patil","Prashant Publication",230);
		
		//Adding book to list
		l1.add(b1);
		l1.add(b2);
		
		l1.add(new Book(03,"let us C","Yashvant","Prashant publisher",134));
		
		System.out.println("After adding new book:"+l1);
		System.out.println(l1.get(0).BookName);
		System.out.println(b1.BookName);
		
		for(Book b :l1) {
			System.out.println(b.ID+" "+b.BookName+" "+b.BookAuthor+" "+b.BookPublisher+" "+b.BookCost+" "+b.BookCost);
		}
		

	}

}
