package com.lara;

public class C1
{
public static void main(String[] args) 
{
String s2="java";
String s3="ja";
String s4=s3.concat("va");
System.out.println(s2==s4);
System.out.println(s2.equals(s4));
System.out.println(s2.hashCode());
System.out.println(s4.hashCode());
}
}
