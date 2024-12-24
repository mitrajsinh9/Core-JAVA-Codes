package jDemo12StaticBlock;
import java.util.Scanner;

class student
{
	static
	{
		System.out.println("Static 1");
		
	}
	int sno;
	String sname;
	
	static
	{
		System.out.println("static 2");
		
	}
	
	student()
	{
		sno=5;
		sname="ram";
		System.out.println("in const"); 
	}
	static
	{
		System.out.println("static 3");
	}
	void printdata()
	{
		System.out.println("Student no. = "+ sno + "; Student name = " + sname);
	}
	static
	{
		System.out.println("static 4");
		
	}
}


public class j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1=new student();
		student s2=new student();
		student s3=new student();
		
		s1.printdata();
		s2.printdata();
		s3.printdata();
		
		
	}

}
