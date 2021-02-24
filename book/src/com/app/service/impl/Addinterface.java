package com.app.service.impl;

import java.util.Scanner;

import com.app.model.Author;
import com.app.model.Book;
import com.app.service.Service;

public class Addinterface implements Service {

	Scanner sc=new Scanner(System.in);
	private Book[] books=null;
	private Author[] authors=null;
//===============================================================
	@Override
	public void addBook() {
		System.out.println("How many books do you know");
		int i=sc.nextInt();
		books=new Book[i];
		for(int j=0;j<books.length;j++)
		{
			Book b=new Book();
			System.out.println("Enter book's id");
			b.setBid(sc.nextInt());
			
			System.out.println("Enter book's name");
			b.setBname(sc.next());
			books[j]=b;
		}
		
	}
	@Override
	public void displayBook() {
		if(books!=null)
		{
			System.out.println("================================================");
			
			System.out.println("Book Id"+" "+"Book Name");

			for(int i=0;i<books.length;i++)
			{
				Book b=books[i];
				System.out.println(b.getBid()+"        "+b.getBname());
			}
			System.out.println("================================================");
			
		}
}
	@Override
	public void addAuthor() {
    if(books!=null)
    {
    	System.out.println("How many authors do you know");
    	int i=sc.nextInt();
    	authors=new Author[i];
    	for(int j=0;j<authors.length;j++)
    	{
    		Author a=new Author();
    		System.out.println("Enter author's id");
    		a.setAid(sc.nextInt());
    		
    		System.out.println("Enter author's name");
    		a.setAname(sc.next());
    		authors[j]=a;
    		
    		displayBook();
    			System.out.println("Enter book id for allocation");
    			int id=sc.nextInt();
    			for(int k=0;k<books.length;k++)
    			{
    				Book b=books[k];
    			if(b.getBid()==id)
    			{
    				a.setBook(b);
    			}
    		}
    		authors[j]=a;
    	}
    }
	}
	@Override
	public void displayAuthor() {
		if(authors!=null && books!=null)
		{
			for(int i=0;i<authors.length;i++)
			{
				Author a=authors[i];
				System.out.println(a.getAid()+" "+a.getAname()+" "+a.getBook().getBid()+" "+a.getBook().getBname());
			}
		}
}



	
	
}
