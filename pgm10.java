import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prg82
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
    	float n1=sc.nextFloat();
    	float n2=sc.nextFloat();
    	float n3;
    	n3=n1*n2;
        DecimalFormat df = new DecimalFormat("##0.00000");
        System.out.println(df.format(n3));
	}
}
