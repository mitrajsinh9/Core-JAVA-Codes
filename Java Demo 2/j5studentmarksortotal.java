package jDemo2;

import java.util.Scanner;

//student rno name engmarks hinmarks , setdata printdata , s1 s2 s3

class student
{
	int rno;
	String name;
	int engmarks; //Data members
	int hinmarks;
	
	void setData() //Data function
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter stu rno =>");
		rno=sc.nextInt();
		
		System.out.print("Enter stu name =>");
		name=sc.next();
		
		System.out.print("Enter english marks =>");
		engmarks=sc.nextInt();	
		
		System.out.print("Enter hindi marks =>");
		hinmarks=sc.nextInt();		
	}
	void printData()
	{
		System.out.println("Roll no. = " + rno + "  Sname = " + name + "  English marks ="+ engmarks + "  Hindi marks =" + hinmarks);
	}
	void printTotal()
	{
			System.out.println("Total = " + (engmarks+hinmarks));
	}
	
}

public class j5studentmarksortotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1=new student();
		student s2=new student();
		student s3=new student();
		
		s1.setData();
		s2.setData();
		s3.setData();
		
		s1.printData();
		s1.printTotal();
		
		s2.printData();
		s2.printTotal();
		
		s3.printData();
		s3.printTotal();

	}

}
