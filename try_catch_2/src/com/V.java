package com;
import java.util.Scanner;
public class V
{
	public static void main(String[] args) 
	{
		
		try
		{
			System.out.println(1);

			int i=10/0; 
			return;
		}
		catch (ArithmeticException ex)
		{
			System.out.println(2);
		}
		finally
		{
		System.out.println(3);
		}
		System.out.println(4);
	}
}