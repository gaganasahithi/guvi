

import java.util.*;
import java.lang.*;
import java.io.*;


class prg85
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,l;
String str;
String str1="",str2="";

Scanner ja=new Scanner(System.in);
str=ja.next();
String s[]=str.split("");
l=str.length();
for(i=0;i<l;i++){
if(i%2!=0)
	str1=str1+s[i];
else
	str2=str2+s[i];
}
System.out.println(str2+" "+str1);
	}
}
