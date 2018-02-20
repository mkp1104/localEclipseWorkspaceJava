package com.lara;
class P
{
P()
	{
System.out.println("P()");
	}
}
public class  Q extends P
{
	public static void main(String[] args) 
	{
		Q q=new Q();
		System.out.println("Q()");
	}
}
