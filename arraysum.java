/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arraysum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int k,n,sum=0;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		k=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<6n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j=0;j<k;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println(sum);
	}
}
