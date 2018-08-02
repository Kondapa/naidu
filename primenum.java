/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==2 || n==3)
		{
			System.out.print("yes");
		}
		while(n!=2 && n!=3)
		{
			if(n%2==0 && n%3==0)
			{
				System.out.print("no");
			}
			else
			{
				System.out.print("yes");
			}
		}
	}
}
