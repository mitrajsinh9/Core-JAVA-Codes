package jDemo11Static;
import java.util.Scanner;

class student1
{
	int sno;
	String sname;
	
	static int c;
	
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter student name =>");
		sname=sc.next();
		
		c++;
		
		sno=c;
		
	}
	
	void printdata()
	{
		System.out.println("Student no. = "+ sno + ";  Student name = "+ sname+" C = "+c);
	}
	
}

public class j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student1 s1=new student1();
		student1 s2=new student1();
		student1 s3=new student1();
		
		s1.setdata();		
		s2.setdata();
		s3.setdata();

		s1.printdata();
		s2.printdata();
		s3.printdata();
	}

}
