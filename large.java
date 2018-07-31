/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class large
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number");
		a=sc.nextInt();
		System.out.println("enter 2nd number");
		b = sc.nextInt();
		System.out.println("enter 3rd number");
		c = sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(a +" is largest");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b +" is largest");
		}
		else
		{
			System.out.println(c +" is largest");
		}
	}
}
