package com;
class A2 
{
	int test(){
		try
		{
		
		return 10;
		}
		catch (ArithmeticException ex)
		{
	//		return 20;
		}
		finally 
		{
		return 10;
		}
	}
}
