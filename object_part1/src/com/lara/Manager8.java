package com.lara;
class I
{
	int x;
	I(int x)
	{
		this.x=x;
	}
	public String toString()
	{
	return "x="+x;
	}
}

public class Manager8
{

	public static void main(String[] args) 
	{
		I obj=new I(10);
		String s0="hello";
		System.out.println(s0);
		String s1="hello"+obj;
		String s2="hello"+12;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(obj);
	}
}
