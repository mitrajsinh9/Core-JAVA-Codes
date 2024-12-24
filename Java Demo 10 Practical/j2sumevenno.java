package jDemo10practical;

import java.util.Scanner;

public class j2sumevenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,no,sum=0,count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter limit = ");
		n=sc.nextInt();
		
			for (int i = 1; i <= n; i++)
				
		    {
		        System.out.print("Enter no. " +i+ " => ");
		        
		        no=sc.nextInt();
		        
		        if(no%2==0)
		    		{
		    			sum=sum+no;
		    			count=count+1;
		    			
		    		}
			
		    }
			System.out.println("\nSum of even no. => "+sum);
			System.out.println("Count of even no. => "+count);
	}
}
