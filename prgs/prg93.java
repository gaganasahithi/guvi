/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prg93
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
System.out.println("Enter N value:");
Scanner sn=new Scanner(System.in);
N=sn.nextInt();
int a[]=new int[N];
int i,sum=0;
for(i=0;i<N;i++) {
  a[i]=sn.nextInt();
}
for(i=0;i<N;i++) {
	sum=sum+a[i];
}
System.out.println(sum);
	}
}
