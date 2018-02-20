package com.lara;
public class M16
{
	public static void main(String[] args) 
	{	String s1="45";
	byte b1=Byte.parseByte(s1);
	int i=Integer.parseInt(s1);
	double d1=Double.parseDouble(s1);//Unboxing Or UnWrapping
	System.out.println("--");
	System.out.println(b1);
	System.out.println(d1);
	System.out.println(i);
	System.out.println("--");
	//int i=Integer.parseInt(s1);
	System.out.println("done");
	}
}
