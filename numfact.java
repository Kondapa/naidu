/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,f=1;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
}
