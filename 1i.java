/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arraysum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int N,K,sum=0;
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		K=sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j=0;j<K;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println(sum);
	}
}
