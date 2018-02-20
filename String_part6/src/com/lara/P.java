package com.lara;
import java.util.Calendar;
import java.util.Date;

public class P
{
public static void main(String[] args) 
{
	Calendar cal=Calendar.getInstance();
	Date d=cal.getTime();
	System.out.println(d);
	cal.roll(Calendar.MONTH, 3);//same as cal.add(Calendar.MONTH,3); but differnce is 
//	cal.add(Calendar.MONTH,3);
	Date d1=cal.getTime();
	System.out.println(d1);

}
}
