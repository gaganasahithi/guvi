

import java.util.*;
import java.lang.*;
import java.io.*;

class naturalk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int x, i = 1 ;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.print(sum);
	}
}
