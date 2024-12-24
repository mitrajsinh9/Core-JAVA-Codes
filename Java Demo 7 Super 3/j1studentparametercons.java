package jDemo7Super3;

import java.util.Scanner;

class student
{
	int sno;
	String name;
	
	student(int x,String y)
	{
		sno=x;
		name=y;
	}
	void printData()
	{
		System.out.println("student no. = " + sno + "  student name = " + name);
	}
}

class marks extends student
{
	int emarks;
	int hmarks;
	
	marks(int x,String y,int a,int b)
	{
		super(x,y);
		emarks=a;
		hmarks=b;
	}

	void printmarks()
	{
		System.out.println("Eng marks = " + emarks + "  Hin marks = " + hmarks);
	}
}

class result extends marks
{	
	result(int x,String y,int a,int b)
	{
		super(x,y,a,b);
	}
	void printresult()
	{
		System.out.println("RESULT = " + (emarks+hmarks));
	}
}
public class j1studentparametercons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		result r1=new result(1,"raj",22,33);
		
		r1.printData();
		r1.printmarks();
		r1.printresult();
	}

}