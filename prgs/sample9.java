import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sample9
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean isLeap=false;
		if(year % 4==0)
		{
			if(year % 100==0)
			{
				if(year%400==0)
				isLeap=true;
				else
				isLeap=false;
			}
			else isLeap=true;
		}
		else
		{
			isLeap=false;
		}
		if(isLeap==true)
		System.out.println("yes");
		else
		System.out.println("No");
		}
		}
		// your code goes here
	
