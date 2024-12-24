package jDemo10practical;

import java.util.Scanner;

public class j4printprimenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,no,c=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter limit =>");
		n=sc.nextInt();
				
			for (int i = 1; i <= n; i++)
		    {
				
				System.out.print("Enter no."+i+" =>");
				no=sc.nextInt();
				c=0;
				
				for(int j=2;j<no;j++)
				{
				if(no%j==0)
				{
				  c=1;
				  break;
				}
				}
				if(c==0)
					
					System.out.println("Is prime no. = "+no);
					
				}
			}
	}

