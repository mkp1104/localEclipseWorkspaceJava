package com.lara;
public class R
{
	public static void main(String[] args) 
	{
		int i=0;
		test1(i);
		test1(10);
		int x[]=new int[2];
		x[0]=10;
		x[1]=20;
		test2(x);
		test2(new int[]{90,30,50});
	}
	static void test1(int i)
	{
			System.out.println(i);
		
	}
	static void test2(int[] y)
	{
	System.out.println(y.length);
	}
}
