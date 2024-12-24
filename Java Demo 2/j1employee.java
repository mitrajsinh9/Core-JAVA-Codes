package jDemo2;

import java.util.Scanner;

//student rno name std fees , setdata printdata , s1 s2 s3
//book bid bname bprice , setdata printdata ,b1 b2 b3
//bank acno cname balance , openac printac , b1

class emp
{
	int eno;
	String ename;
	int salary; //Data members
	
	void setData() //Data function
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter eno =>");
		eno=sc.nextInt();
		
		System.out.print("Enter ename =>");
		ename=sc.next();
		
		System.out.print("Enter salary =>");
		salary=sc.nextInt();		
	}
	void printData()
	{
		System.out.println("Eno = " + eno + " Ename = " + ename + " Salary = " + salary);
	}
	
}

public class j1employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		emp e1=new emp();
		emp e2=new emp();
		emp e3=new emp();
		
		e1.setData();
		e2.setData();
		e3.setData();
		
		e1.printData();
		e2.printData();
		e3.printData();
		
	}

}