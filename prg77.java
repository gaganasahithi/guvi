

import java.util.*;
import java.lang.*;
import java.io.*;


class prg77
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		for(int i = 1; i <= n; ++i)
		{
            	if (n % i == 0)
            	{
            	System.out.print(i + " ");
            	}
		}
	}
}
