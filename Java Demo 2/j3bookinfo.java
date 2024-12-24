package jDemo2;

import java.util.Scanner;

//book bid bname bprice , setdata printdata ,b1 b2 b3

class book
{
	int bid;
	String bname;
	int bprice; //Data members
	
	void setData() //Data function
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter book id =>");
		bid=sc.nextInt();
		
		System.out.print("Enter book name =>");
		bname=sc.next();
		
		System.out.print("Enter book price =>");
		bprice=sc.nextInt();		
	}
	void printData()
	{
		System.out.println("book id = " + bid + " name = " + bname + " price = " + bprice);
	}
	
}
public class j3bookinfo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		book b1=new book();
		book b2=new book();
		book b3=new book();
		
		b1.setData();
		b2.setData();
		b3.setData();
		
		b1.printData();
		b2.printData();
		b3.printData();

	}

}
