package com.lara;

public class A 
{
public static void main(String[] args) 
{
String s1="ada@434 ee43dfd%";
String s[]=s1.split("\\d");
for(String x:s)
{
System.out.println(x);	

}
System.out.println("-----");
for(int x=0;x<6;x++)
{
System.out.println(s[x]);
}
}
}
