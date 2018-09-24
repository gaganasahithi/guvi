import java.util.*;
import java.lang.*;
import java.io.*;

class prg100
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c,sur=0,vol=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		sur=2*((a*b)+(b*c)+(c*a));
		vol=a*b*c;
		System.out.println(sur+" ");
		System.out.println(vol);
	}
}
