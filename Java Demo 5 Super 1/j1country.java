package jDemo5Super1;

import java.util.Scanner;

import jDemo5Super1.usa;

class usa
{
	int a;
	
	void setusa()
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter usa value =>");
			a=sc.nextInt();
	}
	
	void printusa()
	{
		System.out.println("value of usa = "+ a);
	}
	
}
class india extends usa //single inheritance
{
	int a;
	
	void setindia()
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter india value =>");
			a=sc.nextInt();
	}
	
	void printindia()
	{
		System.out.println("value of india = "+ a);
	}
	
	void multi()
	{
		System.out.println("A*A = " + (super.a*a));//same name to use .super
	}
}


public class j1country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		india i1=new india();
		i1.setusa();
		i1.setindia();
		
		i1.printusa();
		i1.printindia();
		i1.multi();

	}

}
