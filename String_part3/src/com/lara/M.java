package com.lara;

public class M
{
public static void main(String[] args) 
{
StringBuffer sb=new StringBuffer();
sb.append("abcdefgh");
System.out.println(sb);
sb.deleteCharAt(2);
System.out.println(sb);
}
}