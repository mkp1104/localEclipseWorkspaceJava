package com.lara;
public class D
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
		throw new NumberFormatException();
		}
		System.out.println(2);
	}
}
