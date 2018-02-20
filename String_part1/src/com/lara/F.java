package com.lara;

public class F
{
public static void main(String[] args) {
	String s1="abc";
	System.out.println(s1);
	String s2="xyz"+s1;
	//s1="xyz"+s1;
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	
}
}
