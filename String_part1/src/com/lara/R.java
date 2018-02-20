package com.lara;

public class R
{
public static void main(String[] args) {
	String s1="    abc            xyz  ";
	System.out.println(s1.length());
	s1=s1.trim();//removes only the leading and trailing white spaces!!!!
	System.out.println(s1);
	System.out.println(s1.length());
}
}