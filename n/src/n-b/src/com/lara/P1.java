package com.lara;
public class P1
{
	static void test() throws ClassNotFoundException
	{
		Class.forName("");
	}
	public static void main(String[] args) 
	{
		try
		{
			test();
		}
		catch (ClassNotFoundException ex)
		{
	
		}
	}
}
