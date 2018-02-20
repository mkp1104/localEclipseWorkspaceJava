package com.lara;
class B1
{
	int i;
}
public class Manager
{

	public static void main(String[] args) 
	{
		B1 b1=new B1();
		String s1=b1.toString();
		int j1=b1.hashCode();
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(j1);
	}
}
