import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sample
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println("input:"+num);
if(num>0)
{
	System.out.println("positive");
}
if(num<0)
{
	System.out.println("negative");
}
}
	}
