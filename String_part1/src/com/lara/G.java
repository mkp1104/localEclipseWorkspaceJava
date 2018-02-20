package com.lara;

public class G
{
public static void main(String[] args) {
	String s1="abc";
	System.out.println(s1);
	System.out.println(s1.hashCode());
	String s2=null+"123";
	s1=null+s1;
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	int x=-32;//integer can be -ve.
	System.out.println(x);
	
}
}
