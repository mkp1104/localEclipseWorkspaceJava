package com.lara;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
public class S1
{
public static void main(String[] args) 
{
	Date d=new Date(1212);
//	DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
	DateFormat df=DateFormat.getDateInstance();
	String s1=df.format(d);
	System.out.println(s1);
}
}
