package com.lara;

public class K 
{
public static void main(String[] args) 
{
StringBuffer sb=new StringBuffer();
sb.append("abcdefgh");
sb.append("12345678");
System.out.println(sb);
sb.delete(2,6);//excluding 2 including 6
System.out.println(sb);
}
}