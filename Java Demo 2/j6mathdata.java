package jDemo2;

import java.util.Scanner;

//math a b setdata printdata multi add sub div m1.set

class math
{
	int a,b;
	
	void setData()
	{
		Scanner sc=new Scanner(System.in);
				
			System.out.print("Enter value of a =>");
			a=sc.nextInt();
			
			System.out.print("Enter value of b =>");
			b=sc.nextInt();
			
	}
	void printData()
	{
		System.out.println("a = " + a + " b = "+b);
	}
	
	
	
	void add()
	{
			System.out.println("Addition = " + (a+b));

	}
	void sub()
	{
			System.out.println("Subtraction = " + (a-b));

	}
	void mul()
	{
			System.out.println("Multiple = " + (a*b));

	}
	void div()
	{
			System.out.println("Division = " + (a/b));

	}

}


public class j6mathdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		math m1=new math();

		
		m1.setData();
		m1.printData();

		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		
		

	}

}
