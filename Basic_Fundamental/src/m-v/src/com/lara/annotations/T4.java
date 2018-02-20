package com.lara.annotations;
class T
{
	T(int i)
	{
		System.out.println("T(int i)");
	
	}
}

class T4 extends T
{
	
		T4(int is)
			{
			super(10);
		System.out.println("T4()");
			}
	public static void main(String args[])
		{
		//T3 t=new T3();
		System.out.println("think");
		}
}