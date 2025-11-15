//Deisgn a library class with appropriate attributes & create an array of library objects. Provide book search facility on the basis of author & title


import java.util.*;
class Book
{
	// Data members
	private int bid;
	private String title;
	private String author;
	private int pages;

	//add two constructor : 1 no arg 2 oarameterized
	Book()
	{
		this.bid = 0;
		this.title = null;
		this.author = null;
		this.pages = 0;
	}
	Book(int bid, String title, String author, int pages)
	{
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	public void display()
	{
		System.out.println("Book Id: " + bid);
		System.out.println("Book Name: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Book Pages: " + pages);
	}
}

public class Library
{
	public static void main(String[] args)
	{
		//create array of book objects
		Book[] books = new Book[3];

		// Create Scanner Object
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i< books.length; i++)
		{
			System.out.println("Enter Book ID: ");
			int bid = sc.nextInt();
			System.out.println("Enter Title: ");
			String btitle = sc.next();
			System.out.println("Enter Author: ");
			String bauthor = sc.next();
			System.out.println("Enter Pages: ");
			int pages = sc.nextInt();

			// Making object of book
			Book temp = new Book(bid,btitle,bauthor,pages);
			books[i] = temp;
		}

		//print these details
		for(Book b:books)
		{
			b.display();
		}
	
	}
}