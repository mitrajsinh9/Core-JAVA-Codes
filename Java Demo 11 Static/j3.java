package jDemo11Static;
import java.util.Scanner;

class stu
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
		System.out.println("Student no. = "+ sno + ";  Student name = "+ sname);
	}
	
	static void printcnt()
	{
		System.out.println("Count = " +  c);
	}
	

}

public class j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stu s1=new stu();
		stu s2=new stu();
		stu s3=new stu();
		
		s1.setdata();		
		s2.setdata();
		s3.setdata();

		s1.printdata();
		s2.printdata();
		s3.printdata();

		stu.printcnt();
	}

}
