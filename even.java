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
		if(n==0)
		{
			System.out.println("number is zero");
		}
		else if(n%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
	}
}
