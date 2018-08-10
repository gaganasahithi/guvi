

import java.util.*;
import java.lang.*;
import java.io.*;


class para
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  String a;
      int count=0;
      Scanner s=new Scanner(System.in);
      a=s.nextLine();
     String b[]=a.split("\\.");
     for(int i=0;i<b.length;i++){
         count++;
     }
     System.out.println(count);

	}
}
