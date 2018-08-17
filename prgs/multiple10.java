

import java.util.*;
import java.lang.*;
import java.io.*;

class multiple10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i<n+10;i++)
        {
            if(i%10==0)
            {
                System.out.print(i);
            }
        }
	}
}
