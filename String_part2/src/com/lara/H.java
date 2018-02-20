
package com.lara;

public class H
{
public static void main(String[] args) 
{
String s1="abc abc abc abc";
int i=s1.indexOf("abc");
//int i=s1.indexOf('abc');
int j=s1.lastIndexOf("abc",5);
int j1=s1.lastIndexOf("abc",9);
System.out.println(i);
System.out.println(j);
System.out.println(j1);
}
}
