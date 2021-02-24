package com.app.cleint;

import java.util.Scanner;

import com.app.service.impl.Addinterface;

public class Test
{

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Addinterface a=new Addinterface();
    String s=" ";
    do
    {
    	System.out.println("1) addBook");
    	System.out.println("2) displayBook");
    	System.out.println("3) addAuthors");
    	System.out.println("4) displayBook");
    	
    	System.out.println("Enter your choice");
    	int i=sc.nextInt();
    	
    	switch(i)
    	{
    	case 1:
    		a.addBook();
    		break;
    	case 2:
    		a.displayBook();
    		break;
    	case 3:
    		a.addAuthor();
    		break;
    	case 4:
    		a.displayAuthor();
    		break;
    		
    	}
    	System.out.println("Do yo want to contineu(y/n)");
    	s=sc.next();
    }
    while(s.equals("y"));
    sc.close();
	}
	

}

