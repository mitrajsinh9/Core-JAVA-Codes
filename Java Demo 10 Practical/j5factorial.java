package jDemo10practical;

import java.util.Scanner;

public class j5factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,no,mul=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter limit = ");
		n=sc.nextInt();
		
		for (int i = 1; i <= n; i++)
        {
			System.out.print("\nEnter no. " +i+ " => ");
	        no=sc.nextInt(); 
	        
        for (int j = 1; j <= no; j++)
        {
        	System.out.print(j+" * "); 
        	mul *= j;
        }
        	System.out.println("\nMul = "+mul);
        
        }
	}

}
