/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}	
}
