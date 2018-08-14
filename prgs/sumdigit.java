

import java.util.*;
import java.lang.*;
import java.io.*;


class sumdigit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int  n= sc.nextInt();
		int sum=0,r=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}
}
	
