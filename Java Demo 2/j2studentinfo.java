package jDemo2;

import java.util.Scanner;

//student rno name std fees , setdata printdata , s1 s2 s3

class stu
{
	int rno;
	String name;
	int std; //Data members
	int fees;
	
	void setData() //Data function
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter rno =>");
		rno=sc.nextInt();
		
		System.out.print("Enter name =>");
		name=sc.next();
		
		System.out.print("Enter std =>");
		std=sc.nextInt();	
		
		System.out.print("Enter fees =>");
		fees=sc.nextInt();		
	}
	void printData()
	{
		System.out.println("Roll no. = " + rno + "  Sname = " + name + "  Std ="+ std + "  Fees =" + fees);
	}
	
}

public class j2studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stu s1=new stu();
		stu s2=new stu();
		stu s3=new stu();
		
		s1.setData();
		s2.setData();
		s3.setData();
		
		s1.printData();
		s2.printData();
		s3.printData();
	}

}
