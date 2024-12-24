package jDemo2;

import java.util.Scanner;

class student3
{
	int rno;
	String name;
	int engmarks; //Data members
	int hinmarks;
	
	void printData()
	{
		System.out.println("Roll no. = " + rno + "  Sname = " + name + "  English marks ="+ engmarks + "  Hindi marks =" + hinmarks);
	}
	
}

public class j7student3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student3 s1=new student3();
		student3 s2=new student3();
		student3 s3=new student3();
		
		s1.printData();
		s2.printData();
		s3.printData();
		

	}

}
