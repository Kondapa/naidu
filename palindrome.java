/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class plaindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,sum = 0,r,t;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		t = n;
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
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
