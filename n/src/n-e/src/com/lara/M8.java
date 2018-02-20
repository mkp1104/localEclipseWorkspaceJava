package com.lara;
public class M8  
{
	public static void main(String[] args) 
	{
		String s1="true";
		String s2="false";
		String s3="abc";
		Boolean b1=new Boolean(s1);
		Boolean b2=new Boolean(s2);
		Boolean b3=new Boolean(s3);
		Boolean b4=b1.booleanValue();
		Boolean b5=b2.booleanValue();
		Boolean b6=b3.booleanValue();
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}
}
