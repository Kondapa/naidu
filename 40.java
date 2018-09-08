/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(b+" ");
		for(int i=1;i<N;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		
		
	}
}
