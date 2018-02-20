package com.lara;//------------------------------V.V.I------------------------------------
public class L
{
	public static void main(String[] args) 
	{
		int[] x=new int[2];
		int y[]=new int[3];
		x=y;//Reinitialization is happing here!!!!!!
		y=x;
		System.out.println("done");
	}
}