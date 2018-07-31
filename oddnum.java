/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class oddnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m,n;
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		for(int i=m;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
