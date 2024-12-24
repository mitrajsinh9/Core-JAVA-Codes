package jDemo2;

import java.util.Scanner;

//bank acno cname balance , openac printac , b1

class bank
{
	int acno;
	String cname;
	int balance; //Data members
	
	void openac() //Data function
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter account no. =>");
		acno=sc.nextInt();
		
		System.out.print("Enter customer name =>");
		cname=sc.next();
		
		System.out.print("Enter bank balamce =>");
		balance=sc.nextInt();		
	}
	void printac()
	{
		System.out.println("account no = " + acno + "; customer name = " + cname + "; bank balance = " + balance);
	}
	
}

public class j4bankinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank a1=new bank();
		bank a2=new bank();
		bank a3=new bank();
		
		a1.openac();
		a2.openac();
		a3.openac();
		
		a1.printac();
		a2.printac();
		a3.printac();
		


	}

}
