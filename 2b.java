/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class plaindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,sum = 0,r,t;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		t = N;
		while(N>0)
		{
			r = N%10;
			sum = (sum*10)+r;
			N = N/10;
		}
		if(sum == t)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
