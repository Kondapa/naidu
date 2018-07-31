/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,p,power=1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		p=sc.nextInt();
		for(int i =1;i<=p;i++)
		{
			power = power*num;
		}
		System.out.println(power);
	}
}
