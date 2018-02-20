package com.lara;
class H
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	static void test()
	{
	System.out.println(3);
	int i;
	try
	{
	i=10/0;	
	
	}
	catch (ArithmeticException ex)
	{
		
	ex.printStackTrace();
	i = 5 + 8;
	System.out.println(4);
	}
	
	System.out.println(5);
	}
}
