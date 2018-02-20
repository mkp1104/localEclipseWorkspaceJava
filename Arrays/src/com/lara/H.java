package com.lara;
public class H
{
	public static void main(String[] args) 
	{
		int i=1;
		String[] x=new String[i];
		System.out.println("--");
		i=0;
		String y[]=new String[i];//Runtime Exception
		y[0]="abc";
		System.out.println(y[0]);
		System.out.println("--");
		i=-2;
//		String z[]=new String[i];
		System.out.println("--");
	}
}
