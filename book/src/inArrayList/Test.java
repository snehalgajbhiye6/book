package inArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test 
{
	List books=null;
	List authors=null;
	Scanner sc=new Scanner(System.in);
//==================================================================================
	public void addBook()
	{
		books=new ArrayList();
		System.out.println("How many books do you want");
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			Book b=new Book();
			System.out.println("Enter book's id");
			b.setBid(sc.nextInt());
			System.out.println("Enter book's name");
			b.setBname(sc.next());
			books.add(b);
		}
	}
//=================================================================================
	public void displayBook()
	{
		if(!books.isEmpty()) {
			System.out.println("================================================");
			System.out.println("Book Id"+" "+"Book Name");
			for(Object o1:books)
			{
				Book b1=(Book)o1;
				System.out.println(b1.getBid()+"      "+b1.getBname());
			}
			System.out.println("================================================");

		}
	}
//================================================================================
	public void addAuthor()
	{
		authors=new ArrayList();
		System.out.println("How many author you know");
		int k=sc.nextInt();
		for(int j=0;j<k;j++)
		{
			Author a=new Author();
			System.out.println("Enter author's id");
			a.setAid(sc.nextInt());
			
			System.out.println("Enter author's name");
			a.setAname(sc.next());
			displayBook();
			
			List list=new ArrayList();
			System.out.println("How many books do you want to read");
			int m=sc.nextInt();
			for(int n=0;n<m;n++)
			{
				System.out.println("Enter id for allocation");
				int id=sc.nextInt();
				for(Object o2:authors)
				{
					Author y=(Author)o2;
					if(y.getAid()==id)
					{
						list.add(y);
					}
					a.setBook(list);
				}
			}
			authors.add(a);
		}
	}
//================================================================================
	public void displayAuthor()
	{
		if(!authors.isEmpty())
		{
			System.out.println("=======================================================");
			System.out.println("Book Id"+" "+"Book Name"+" "+"Author Id"+" "+"Author Name");
			for(Object o3:authors)
			{
				Author z=(Author)o3;
				if(!z.getBook().isEmpty())
				{
					for(Object o4:z.getBook())
					{
						Book k=(Book)o4;
						System.out.println(k.getBid()+"    "+k.getBname()+"    "+z.getAid()+"    "+z.getAname());
					}
				}
			}
			System.out.println("======================================================");
		}
	}
//================================================================================
    public static void main(String[] args)
    {
    	Test t=new Test();
    	t.addBook();
    	t.displayBook();
    	t.addAuthor();
    	t.displayAuthor();
    }
}
