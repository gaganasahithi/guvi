

import java.util.*;
import java.lang.*;
import java.io.*;

class product0f2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n,a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		n=a*b;
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
