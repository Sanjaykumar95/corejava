package daysix;

import java.util.Scanner;

public class fibonacci {
public static void main(String args[])
{
	int f1=0 ,f2=1,f3=f1+f2,i,n;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the limit");
	try {
		n=in.nextInt();
		while(n>f3)
		{
			f3=f1+f2;
		f1=f2;
		f2=f3;
		System.out.print(f3+",");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
