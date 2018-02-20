package com.lara;

public class L 
{
public static void main(String[] args) 
{
StringBuffer sb=new StringBuffer();
sb.append("abcdefgh");
System.out.println(sb);
sb.delete(2,50);
System.out.println(sb);
}
}