

import java.util.*;
import java.lang.*;
import java.io.*;


class primeintervals
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int low = 1, high = 10;

        while (low < high)
        {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) 
            {
                
                if(low % i == 0) 
                {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
	}
	
}
}
