

import java.util.*;
import java.lang.*;
import java.io.*;

class 10num
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n;
		   int a[]=new int[10];
           for(int i=0;i<10;i++)
        {
        	   a[i]=s.nextInt();
          }
                 Arrays.sort(a);
          System.out.print(a[0]);
        }
	}
