

import java.util.*;
import java.lang.*;
import java.io.*;


class lowandhigh
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[0]+" "+a[n-1]);
        
	}
}
