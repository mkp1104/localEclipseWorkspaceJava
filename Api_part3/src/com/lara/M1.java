package com.lara;
public class M1
{
	public static void main(String[] args) 
	{
		int[] x=new int[2];
		x[0]=10;
		x[1]=20;
		int y[]=x;
		Object obj=y;
//		System.out.println(obj.x[0]); not possible to Access the contents of Arrays through obj .
		int[] z=(int[]) obj;
		System.out.println("done");
		System.out.println(obj);
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
	}
}
