package com.lara;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
public class S
{
public static void main(String[] args) 
{
	Date d=new Date();
	DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
	String s1=df.format(d);
	System.out.println(s1);
}
}
