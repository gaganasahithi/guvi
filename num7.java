/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class num7
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int n1=in.nextInt();
		int n2=in.nextInt();
		if(a>n1 && a<n2)
		    System.out.println("yes");
		else
			System.out.println("no");
	}
}
