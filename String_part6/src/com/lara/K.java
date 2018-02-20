package com.lara;
import java.util.Calendar;
import java.util.Date;

public class  K
{
public static void main(String[] args) 
{
Calendar cal=Calendar.getInstance();
cal.add(Calendar.DATE,3);
cal.add(Calendar.MONTH,3);
cal.add(Calendar.YEAR,3);
Date d=cal.getTime();
System.out.println(cal);
System.out.println(d);


}
}
