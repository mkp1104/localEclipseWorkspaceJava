package com.lara;
import java.util.Date;

public class I

{
public static void main(String[] args) 
{
Date d0=new Date();	
Long num=d0.getTime();
Date d1=new Date(num-1000*60*60*24);//1 day after 1/1/1970.
Date d2=new Date(num-1000*60*60*24*7);//1 day after 1/1/1970.


System.out.println(d0);
System.out.println(num);
System.out.println(d1);
System.out.println(d2);
}
}
