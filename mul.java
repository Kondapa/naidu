/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num;
		Scanner sc =new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int count = num*i;
			System.out.print(count +"\t");
		}
	}
}
