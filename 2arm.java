/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,sum=0,temp,r;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		temp=N;
		while(N!=0)
		{
			r=N%10;
			sum=r*r*r+sum;
			N=N/10;
		}
		if(sum==temp)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
