/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class digitofnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		while(n>0)
		{
			n = n/ 10;
			count++;
		}
		System.out.print(" " +count);
	}
}
