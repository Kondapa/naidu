/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class leap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if(year%4 == 0)
		{
			System.out.println(year +" is leap year");	
		}
		else
		{
			System.out.println(year +" is not leap year");
		}
	}
}
