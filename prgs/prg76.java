/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		for(int i=2;i<=n;i++){
			if(n%i==0)
				count++;	
		}
		if(count==1)
			System.out.println("no");
		else
			System.out.println("yes");
	}
}
