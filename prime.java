package daysix;

import java.util.Scanner;

public class prime {
public static void main(String args[])
{
	int c=0;
	Scanner in =new Scanner(System.in);
	System.out.println("enter the number to be checked");
	
	try {
		int n=in.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
		      c=1;
			else
				c=0;
		}
		if (c==1)
			System.out.println("not a prime");
		else
			System.out.println("prime");
	} catch (Exception e) {
		
		System.out.println(e);;
	}
			
			
			
			
}
}
