

import java.util.*;
import java.lang.*;
import java.io.*;


class nearesteven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		n=n-1;
		if((n)%2==0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(n+1);
		}
	}
}
