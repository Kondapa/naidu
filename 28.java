/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,a[];
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<N;j++)
		{
			System.out.println(a[j]+" "+j);
		}
	}
}
