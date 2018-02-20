package com.lara;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
public class Z2
{
public static void main(String[] args) 
{
	
	double num=121765.6768;
	NumberFormat nf=NumberFormat.getInstance();
	System.out.println(num);
	String s1=nf.format(num);
	System.out.println(s1);
	Number n=null;
	double nd=0;
	try
	{
		n=nf.parse(s1);
	//	nd=nf.parse(s1);
		
	System.out.println(n);
	}
	catch(ParseException p)
	{
		p.printStackTrace();
		
	}
	
}
}
