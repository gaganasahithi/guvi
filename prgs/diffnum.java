

import java.util.*;
import java.lang.*;
import java.io.*;

class diffnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int s=Math.abs(n-m);
            if(s%2==0)
            {
                System.out.print("even");
            }
            else
            System.out.print("odd");
	}
}
