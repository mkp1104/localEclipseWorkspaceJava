package com.lara;//------------------------------V.V.I------------------------------------
public class M
{
	public static void main(String[] args) 
	{
		M m=new M();
		int[] x=new int[2];
		int y[]=x;
		Object obj=y;
		int[] z=(int[]) obj;
		System.out.println("done");
		System.out.println(z[0]);
		System.out.println(z[1]);
//		System.out.println(z[2]);
		System.out.println(obj);
		System.out.println(x);
		System.out.println(m);
		
	}
}
