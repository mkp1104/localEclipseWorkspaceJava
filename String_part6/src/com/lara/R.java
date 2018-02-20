package com.lara;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
public class R
{
public static void main(String[] args) 
{
	Date d=new Date();
	DateFormat df=DateFormat.getDateInstance();
	String s1=df.format(d);
	String s2=df.format((Object)d);
	String s3=df.format(d);
	String s4=df.format(d);
	String s5=df.format(d);
	System.out.println(s1);
	System.out.println(s2);
}
}
