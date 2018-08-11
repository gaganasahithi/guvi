

import java.util.*;
import java.lang.*;
import java.io.*;


class fibonacciseries
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1,n3,count;
		count=sc.nextInt();
		for(int i=0;i<count-1;i++)
		{
			n3=n1+n2;
			System.out.println("  "+n3);
			n1=n2;
			n2=n3;
	}
}
