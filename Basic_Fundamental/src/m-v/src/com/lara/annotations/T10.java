package com.lara.annotations;
abstract class T9
{
abstract void	test();
}

class T10
{
	
	public static void main(String args[])
		{
		T9 t=new T9()
			{
				void test()
				{
				}
			};
		System.out.println("think");
		}
}