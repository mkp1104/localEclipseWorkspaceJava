package com.lara;
import java.util.Date;

public class G
{
public static void main(String[] args) 
{
Date d0=new Date();	
Date d=new Date(1000*60*60*24);//1 day after 1/1/1970.
Long num=d.getTime();
System.out.println(d);
System.out.println(num);
System.out.println(d0);
Long num0=d0.getTime();
System.out.println(num0);

}
}
