

import java.util.*;
import java.lang.*;
import java.io.*;


class sameorder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int reversenum=0;
		int count=0;
		 while( n!= 0 )
      {
             reversenum = reversenum * 10;
             reversenum = reversenum + n%10;
             n= n/10;
             count++;
      }

		while(reversenum>0)
		{
			int digit=reversenum%10;
			System.out.print(digit);
		            if(count!=(count-1))
			System.out.print(" ");
			reversenum=reversenum/10;
		}
	}
}
