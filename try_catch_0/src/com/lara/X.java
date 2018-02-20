package com.lara;
class X 
{
	public static void main(String[] args) 
	{
		try
		{
			int i=10/0;
		}
//		
		catch (ArithmeticException t)
		{
		System.out.println(4);
		}
		catch (Exception t)
		{
		System.out.println(2);
		}
		catch (Throwable t)
		{
		System.out.println(1);
		}
//		catch (SQLException t1)
//		{
//		System.out.println(4);
//		}
//		System.out.println("done");
//
//		
//		catch (RuntimeException t)
//		{
//		System.out.println(3);
//		}
//		
		System.out.println("done");
	}
}