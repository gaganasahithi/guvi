import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sample8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b)
		{
			if(a>=c)
			System.out.println(a);
			else
			System.out.println(c);
		}
		else
		{
			if(b>=c)
			System.out.println(b);
			else
			System.out.println(c);
			
		
		}
		
	}
}
