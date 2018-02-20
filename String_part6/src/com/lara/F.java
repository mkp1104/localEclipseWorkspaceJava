package com.lara;
import java.util.Date;

public class F
{
public static void main(String[] args) 
{
Date d0=new Date();	
Date d=new Date(1000*60*60*24);//1 day after 1/1/1970.

System.out.println(d);
System.out.println(d.getTime());
System.out.println(d0);
System.out.println(d0.getTime());

}
}
