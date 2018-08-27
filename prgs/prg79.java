

import java.util.*;
import java.lang.*;
import java.io.*;


class prg79
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=m*n;
        int y=(int)Math.sqrt(x);
        if(y*y==x){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
	}
}
