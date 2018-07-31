/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);
       
        n = s.nextInt();
        a = n;
        c = n;
        while(a > 0)
        {
            a = a / 10;
            count++;
        }
        while(n > 0)
        {
            b = n % 10;
            sum = (int) (sum+Math.pow(b, count));
            n = n / 10;
        }
        if(sum == c)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }    
    }
}
	
