/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,K,sum=1,i;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		for(i=0;i<K;i++)
		{
			sum=sum*N;
		}
		System.out.println(sum);
	}
}
