/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prg75
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int l=s.length();
		if(l%2==0)
			System.out.println(s.substring(0,l/2-1)+"**"+s.substring(l/2+1));
		else
			System.out.println(s.substring(0,l/2)+"*"+s.substring(l/2+1));
	}
}
