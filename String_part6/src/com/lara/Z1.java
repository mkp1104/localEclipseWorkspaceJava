package com.lara;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
public class Z1
{
public static void main(String[] args) 
{
	
	Date d=new Date();
	DateFormat df=DateFormat.getInstance();
//	DateFormat df=DateFormat.getDateInstance();
	String s1=df.format(d);
	Date d1=null;
	try
	{
		d1=df.parse(s1);
	System.out.println(d1);
	System.out.println(d);
	
	}
	catch(ParseException p)
	{
		p.printStackTrace();
		
	}
	
}
}
