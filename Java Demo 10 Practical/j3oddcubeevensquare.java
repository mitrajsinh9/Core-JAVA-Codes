package jDemo10practical;

import java.util.Scanner;

public class j3oddcubeevensquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,no;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter limit => ");
		n=sc.nextInt();
		
			for (int i = 1; i <= n; i++)
				
		    {
				System.out.print("Enter no. " +i+ " => ");
		        
		        no=sc.nextInt();
		        
		        if(no%2==0)
		    		{
		    		System.out.println(no+" = "+no*no);
		    		}
		        else {
		        	
		        	System.out.println(no+" = "+no*no*no);
		        }
			
		    }
	}

}
