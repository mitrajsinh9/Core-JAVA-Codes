package jDemo11Static;
import java.util.Scanner;

class student
{
	int sno;
	String sname;
	
	static int c;
	
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter student no. =>");
		sno=sc.nextInt();
		
		System.out.print("Enter student name =>");
		sname=sc.next();
		
		c++;
		
	}
	
	void printdata()
	{
		System.out.println("Student no. = "+ sno + ";  Student name = "+ sname+" c = "+c);
	}
	
}

public class j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1=new student();
		student s2=new student();
		student s3=new student();
		
		s1.setdata();
		s1.printdata();
		s2.printdata();
		s3.printdata();
		
		
		s2.setdata();
		s1.printdata();
		s2.printdata();
		s3.printdata();
		
		s3.setdata();
		s1.printdata();
		s2.printdata();
		s3.printdata();
	}

}
