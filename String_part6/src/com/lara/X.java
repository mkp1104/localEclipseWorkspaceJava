package com.lara;
import java.util.Calendar;
import java.util.Date;
import java.text.NumberFormat;
public class X
{
public static void main(String[] args) 
{
	double num=123123.2323;
	NumberFormat nf=NumberFormat.getInstance();
//	NumberFormat nf=NumberFormat.getNumberInstance();
	String s1=nf.format(num);
	System.out.println(num);
	System.out.println(s1);	
	System.out.println(nf.format(num));
}
}
