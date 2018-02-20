package com.lara;
public class J2
{
	int i;
	J2()
	{
	
	}
	public static void main(String args[])
	{
	try
		{
			int y=10/0;
			System.out.println("try-Block");
}
try
		{
	
		System.out.println(6);
J2 j=new J2();
j=null;
System.out.println(j.i);
		}

		catch(ArithmeticException ex)//Throwable
		{
		System.out.println("Catch-AE-Block");

		}
		
		catch(NullPointerException p)
		{
				System.out.println("------");
			p.printStackTrace();
				System.out.println("-----");
			System.out.println(p);
				System.out.println("----");
			System.out.println(p.getMessage());
	System.out.println("----");
				System.out.println("catch-NP-Block");
		}
	}
}