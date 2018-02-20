package com.lara;

public class N
{
public static void main(String[] args) 
{
StringBuilder sb=new StringBuilder();
sb.append("helloJava");
System.out.println(sb.capacity());
System.out.println(sb.reverse());
sb.deleteCharAt(2);
sb.trimToSize();
System.out.println(sb);
System.out.println(sb.capacity());
}
}