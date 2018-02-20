package com.lara;
import java.lang.Exception;//Throwable.Exception-CTE
public class J3
{
	public static void main(String args[])
	{
	System.out.println(1);
	try
		{
			int i=10/0;
		}
		catch(ArithmeticException ex) //Throwable//Throwable
		{
		System.out.println(2);
		System.out.println(ex);
		System.out.println(3);

		}
		/*catch(ArithmeticException ex)
		{
	System.out.println(4);	
		}*/
	System.out.println(4);
	}
}