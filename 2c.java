/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		if(N==2 || N==3)
		{
			System.out.print("yes");
		}
		if(N!=2 && N!=3)
		{
			if(N%2==0 && N%3==0)
			{
				System.out.print("no");
			}
			else
			{
				System.out.print("yes");
			}
		}
	}
}
