package com.lara;
public class K
{
	public static void main(String[] args) 
	{
		int[] x=new int[2];
		x[0]=10;
		test1(x);//pass by reff.
		System.out.println(x[0]);
		test2(x[0]);//pass by value.
		System.out.println(x[0]);
	}
	static void test1(int[] y)
	{
	y[0]=20;
	}
	static void test2(int z)

	{
	
	z=30;
	}
}
