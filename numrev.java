/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,r,rev=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		while(N>0)
		{
			r=N%10;
			rev=(rev*10)+r;
			N=N/10;
		}
		System.out.println(rev);
	}
}
