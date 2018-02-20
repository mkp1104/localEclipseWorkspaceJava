package com.lara;
import java.util.StringTokenizer;
public class B 
{
public static void main(String[] args) 
{
String s1="abc;xyz;123";
String s2=";";
StringTokenizer st=new StringTokenizer(s1,s2);//best way to split A string instead of Split();!!!
while(st.hasMoreElements())
{
	System.out.println(st.nextElement());
}
}
}
