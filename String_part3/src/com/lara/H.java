package com.lara;

public class H 
{
public static void main(String[] args) 
{
StringBuffer sb=new StringBuffer();
sb.append("abc");
sb.append("abc");
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.trimToSize();//return type int.
System.out.println(sb.capacity());
System.out.println(sb.length());
}
}
