/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char str;
		Scanner sc = new Scanner(System.in);
		str = sc.next().charAt(0);
		if(str == 'a'||str == 'e'||str == 'i'||str == 'o'||str == 'u'||str == 'A'||str == 'E'||str == 'I'||str == 'O'||str == 'U')
		{
			System.out.println(str + " is vowel");		
		}
		else
		{
			System.out.println(str +" is constant");
		}
	}
}
