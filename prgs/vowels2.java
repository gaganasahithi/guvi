/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vowels2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		
		
		
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
